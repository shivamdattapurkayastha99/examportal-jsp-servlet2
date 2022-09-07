package com.examapp.helper;
import java.sql.*;
public class ConnectionProvider {
	public static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/examjsp","root","root");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
