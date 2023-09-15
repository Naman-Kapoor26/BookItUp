package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.hsbc.bean.Employee;
import com.hsbc.bean.Meeting;
import com.hsbc.bean.MeetingRoom;
import com.hsbc.dao.util.DBUtil;

public class RoomDAOImpl implements RoomDAO{


	@Override
	public void saveRoom(MeetingRoom room) {
		
		try {
			
			//preparedStatement
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "insert into meetingRoom values(?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			statement.setString(1,room.getRoom_name());
			statement.setInt(2, room.getSeat_capacity());
			statement.setDouble(3, room.getReviews());
			statement.setBoolean(4, room.isHasProjector());
			statement.setBoolean(5, room.isHasWifi());
			statement.setBoolean(6, room.isHasConfCall());
			statement.setBoolean(7, room.isHasBoard());
			statement.setBoolean(8, room.isHasWater());
			statement.setBoolean(9, room.isHasTV());
			statement.setBoolean(10, room.isHasCoffee());
			
			//execute statement
			

			
			statement.close();
			connection.close();
			
		}catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
	}

	@Override
	public MeetingRoom getRoom(int id) {
		MeetingRoom meetingRoom = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1,id);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				String room_name = result.getString("room_name");
				//employee.setName(empName);
				
				int seat_capacity = result.getInt("seat_capacity");
				
				Double reviews = result.getDouble("reviews");

				Boolean hasProjector= result.getBoolean("hasProjector");
				Boolean hasWifi= result.getBoolean("hasWifi");
				Boolean hasConfCall= result.getBoolean("hasConfCall");
				Boolean hasBoard= result.getBoolean("hasBoard");
				Boolean hasWater= result.getBoolean("hasWater");
				Boolean hasTV= result.getBoolean("hasTV");
				Boolean hasCoffee= result.getBoolean("hasCoffee");
					
				meetingRoom = new MeetingRoom(room_name,seat_capacity,reviews,hasProjector,hasWifi,
			            hasConfCall, hasBoard,hasWater,hasTV,hasCoffee);
			}
			
			
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return meetingRoom;
	}

	@Override
	public void deleteRoom(int id) {
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "delete from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			ResultSet result = statement.executeQuery();
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	@Override
	public Set<MeetingRoom> getAllRoom() {
		Set<MeetingRoom> meetingRooms= null;
		MeetingRoom meetingRoom=null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employees";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				String room_name = result.getString("room_name");
				//employee.setName(empName);
				
				int seat_capacity = result.getInt("seat_capacity");
				
				Double reviews = result.getDouble("reviews");

				Boolean hasProjector= result.getBoolean("hasProjector");
				Boolean hasWifi= result.getBoolean("hasWifi");
				Boolean hasConfCall= result.getBoolean("hasConfCall");
				Boolean hasBoard= result.getBoolean("hasBoard");
				Boolean hasWater= result.getBoolean("hasWater");
				Boolean hasTV= result.getBoolean("hasTV");
				Boolean hasCoffee= result.getBoolean("hasCoffee");
					
				meetingRoom = new MeetingRoom(room_name,seat_capacity,reviews,hasProjector,hasWifi,
			            hasConfCall, hasBoard,hasWater,hasTV,hasCoffee);
				meetingRooms.add(meetingRoom);
			}
			
			
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return meetingRooms;
	}


	
}