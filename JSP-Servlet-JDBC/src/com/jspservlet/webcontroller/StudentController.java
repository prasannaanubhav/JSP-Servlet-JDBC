package com.jspservlet.webcontroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.jspservlet.model.Student;
import com.jspservlet.service.ServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/sampledb")
	private DataSource dataSource;

	private ServiceImpl serviceImpl;

	@Override
	public void init() throws ServletException {
		super.init();
		serviceImpl = new ServiceImpl(dataSource);

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");
		if (command == null) {
			command = "LIST";
		}
		switch (command) {
		case "LIST":
			listStudents(request, response);
			break;

		case "ADD":
			try {
				addStudent(request, response);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;

		case "LOAD":
			try {
				loadStudent(request, response);
			} catch (SQLException | ServletException | IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "UPDATE":
			try {
				updateStudent(request,response);
			} catch (SQLException | ServletException | IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "DELETE":
			try {
				deleteStudent(request,response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		default:
			listStudents(request, response);
			break;
		}

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String id = request.getParameter("studentId");
		int sid = Integer.parseInt(id);
		serviceImpl.deleteStudent(sid);
		listStudents(request, response);
		
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String id = request.getParameter("studentID");
		int sid = Integer.parseInt(id);

		Student student = new Student(firstname, lastname, email);
		student.setId(sid);
		serviceImpl.updateStudent(student);
		listStudents(request, response);
		
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

		String id = request.getParameter("studentId");
		int sid = Integer.parseInt(id);
		Student student = serviceImpl.loadStudent(sid);
        request.setAttribute("student", student);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student-form.jsp");
		dispatcher.forward(request, response);

	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");

		Student student = new Student(firstname, lastname, email);
		serviceImpl.addStudent(student);
		listStudents(request, response);

	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("studentList", serviceImpl.getListOfStudent());
			RequestDispatcher dispatcher = request.getRequestDispatcher("/student_list.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
