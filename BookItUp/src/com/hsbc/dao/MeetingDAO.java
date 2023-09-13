package com.hsbc.dao;

import java.util.Set;

import com.hsbc.bean.Meeting;
import com.hsbc.bean.MeetingRoom;

public interface MeetingDAO{
	public void saveMeeting(Meeting meeting);
	
	public Meeting getMeeting(int id);
	
	public void deleteMeeting(int id);
	
	public Set<Meeting> getAllMeeting();
	
	
}