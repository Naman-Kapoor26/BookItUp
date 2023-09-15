package com.hsbc.exception;

public class EmployeeNotCreatedException extends Exception {

	//regex fail throws this
	public EmployeeNotCreatedException(){
        super();
    }

    public EmployeeNotCreatedException(String msg){
        super(msg);
    }
}
