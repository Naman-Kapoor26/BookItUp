package com.hsbc.util;

import com.hsbc.dao.MeetingDAO;
import com.hsbc.dao.MeetingDAOImpl;

public class MeetingDAOFactory {
	
    public MeetingDAO getMeetingDAO(){
    	MeetingDAO meetingdao = new MeetingDAOImpl();
        return meetingdao;
    }
}
