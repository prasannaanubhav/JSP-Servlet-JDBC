package com.jspservlet.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestJDBCServletConnection
 */
@WebServlet("/TestJDBCServletConnection")
public class TestJDBCServletConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/sampledb")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Connection connection = dataSource.getConnection();
			String sql = "select*from student";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String email = resultSet.getString("email");
				out.println(email);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
