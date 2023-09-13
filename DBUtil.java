package com.hsbc.dao.util;

//a class to reuse the connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(Driver.class.getName());  //"com.mysql.cj.Driver";
		
		//getConnection(url, username, password);
		Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "888999ghI@");
		
		return connection;
	}
}