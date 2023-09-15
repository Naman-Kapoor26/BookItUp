package com.hsbc.service;

import java.util.Set;

import com.hsbc.bean.Employee;
import com.hsbc.bean.Meeting;
import com.hsbc.exception.EmployeeNotCreatedException;
import com.hsbc.exception.IDNotFoundException;

public interface EmployeeService{
	
	public void createEmployee(Employee emp) throws EmployeeNotCreatedException;
	
	public Employee searchEmployee(int uid) throws IDNotFoundException;
	
	public Set<Meeting> viewMeeting(int uid) throws IDNotFoundException; //user can see his scheduled meetings
	
	public void giveReview(int uid, int meetingId) throws IDNotFoundException ;

	
	
	
}