package com.hsbc.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {

	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName(Driver.class.getName());
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","naman");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Driver class not found");
			System.exit(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
