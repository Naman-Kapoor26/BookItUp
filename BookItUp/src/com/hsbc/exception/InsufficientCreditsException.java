package com.hsbc.exception;

public class InsufficientCreditsException extends Exception {
    
    public InsufficientCreditsException(){
        super();
    }

    public InsufficientCreditsException(String msg){
        super(msg);
    }
}
