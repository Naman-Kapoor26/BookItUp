package com.hsbc.dao;

import java.util.Set;

import com.hsbc.bean.Meeting;
import com.hsbc.bean.MeetingRoom;

public interface MeetingDAO{
	public void saveMeeting(Meeting meeting);
	
	public Meeting getMeetingById(int id);
	
	public Meeting getMeetingByName(String meetName);
	
	public void deleteMeeting(int id);
	
	public Set<Meeting> getAllMeeting();
	
	
}