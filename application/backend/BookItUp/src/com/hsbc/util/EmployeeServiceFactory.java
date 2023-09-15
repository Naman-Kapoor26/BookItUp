package com.hsbc.util;

import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	
    public EmployeeService getEmployeService(){
        EmployeeService empservice = new EmployeeServiceImpl();
        return empservice;
    }
}
