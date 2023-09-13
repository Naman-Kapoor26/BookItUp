package com.hsbc.dao;

import java.util.Set;

import com.hsbc.bean.Employee;
import com.hsbc.bean.MeetingRoom;

public interface EmployeeDAO{
	public void saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public Set<Employee> getAllEmployee();
}