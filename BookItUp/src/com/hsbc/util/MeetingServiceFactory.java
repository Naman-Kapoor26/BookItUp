package com.hsbc.util;

import com.hsbc.service.MeetingService;
import com.hsbc.service.MeetingServiceImpl;

public class MeetingServiceFactory {
	
    public MeetingService getMeetingService(){
    	MeetingService meetingservice = new MeetingServiceImpl();
        return meetingservice;
    }
}
