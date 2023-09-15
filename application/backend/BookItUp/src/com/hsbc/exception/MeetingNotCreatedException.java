package com.hsbc.exception;

public class MeetingNotCreatedException extends Exception {
    
    public MeetingNotCreatedException(){
        super();
    }

    public MeetingNotCreatedException(String msg){
        super(msg);
    }
}
