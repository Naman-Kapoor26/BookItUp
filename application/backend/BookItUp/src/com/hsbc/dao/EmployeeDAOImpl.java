package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.hsbc.bean.Employee;
import com.hsbc.dao.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void saveEmployee(Employee employee) {
		
				try {
					
					//preparedStatement
					Connection connection= DBUtil.getConnection();
					String sqlQuery = "insert into employee values(?,?,?,?)";
					
					PreparedStatement statement = connection.prepareStatement(sqlQuery);
					
					statement.setString(1,employee.getRole());
					statement.setString(2, employee.getName());
					statement.setString(3, employee.getEmail());
					statement.setLong(4, employee.getPhone());
					
					//execute statement
					

					
					statement.close();
					connection.close();
					
				}catch(SQLException sqle) {
					
					sqle.printStackTrace();
				}
		
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1,id);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				String role = result.getString("role");
				//employee.setName(empName);
				
				String name = result.getString("name");
				
				String email = result.getString("email");

				Long phone = result.getLong("phone");
				//employee.setSalary(empSalary)
					
				employee = new Employee(role,name,email,phone);
			}
			
			
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return employee;
	}

	
	
	
	
	
	
	@Override
	public Set<Employee> getAllEmployee() {
		Set<Employee> employees=null;
		Employee employee = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employees";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				String role = result.getString("role");
				//employee.setName(empName);
				
				String name = result.getString("name");
				
				String email = result.getString("email");

				Long phone = result.getLong("phone");
				//employee.setSalary(empSalary)
					
				employee = new Employee(role,name,email,phone);
				employees.add(employee);
			}
			
			
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return employees;
	}
	
}