package com.hsbc.exception;

public class IDAlreadyExistsException extends Exception{
    
    public IDAlreadyExistsException(){
        super();
    }

    public IDAlreadyExistsException(String msg){
        super(msg);
    }
}
