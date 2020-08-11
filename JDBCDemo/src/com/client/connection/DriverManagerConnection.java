package com.client.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnection {

	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String user = "root";
		String password = "anubhav8969";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			if(connection!=null) {
				System.out.println("connection made");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();	
	}
		return connection;

}
}
