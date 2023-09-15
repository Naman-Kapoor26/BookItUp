package com.hsbc.service;

import com.hsbc.bean.Meeting;
import com.hsbc.exception.IDNotFoundException;
import com.hsbc.exception.ImproperAmenitiesException;
import com.hsbc.exception.InsufficientCreditsException;
import com.hsbc.exception.MeetingNotCreatedException;

public interface MeetingService{
	
	public void scheduleMeeting(int uid, Meeting meeting) throws MeetingNotCreatedException, InsufficientCreditsException, ImproperAmenitiesException;
	
	public void addMember(int hostId, int joineeId) throws IDNotFoundException;
	
	public void cancelMeet(int hostId, int meetId) throws IDNotFoundException;
	
	public Meeting searchMeetById(int meetId) throws IDNotFoundException;
	
	public Meeting searchMeetByName(String meetName);
	
	public Meeting giveReview(String meetName);
}