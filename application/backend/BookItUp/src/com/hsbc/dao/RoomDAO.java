package com.hsbc.dao;

import java.util.Set;

import com.hsbc.bean.Meeting;
import com.hsbc.bean.MeetingRoom;

public interface RoomDAO{
	
    public void saveRoom(MeetingRoom room);
	
	public Set<MeetingRoom> getAllRoom();
	
	public void deleteRoom(int id);
	
	public MeetingRoom getRoom(int id);
	
}