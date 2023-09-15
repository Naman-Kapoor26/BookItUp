package com.hsbc.util;

import com.hsbc.dao.EmployeeDAO;
import com.hsbc.dao.EmployeeDAOImpl;

public class EmployeeDAOFactory {
	
    public EmployeeDAO getEmployeDAO(){
        EmployeeDAO empdao = new EmployeeDAOImpl();
        return empdao;
    }
}
