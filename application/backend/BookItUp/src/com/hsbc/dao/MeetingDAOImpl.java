package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import com.hsbc.bean.Meeting;
import com.hsbc.dao.util.DBUtil;

public class MeetingDAOImpl implements MeetingDAO{

	
//	private int meetingId;
//	private String title;
//	private String date;
//	private Date startTime;
//	private Date endTime;
//	private String meetingType;
	
	@Override
	public void saveMeeting(Meeting meeting) {
try {
			
			//preparedStatement
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "insert into meetingRoom values(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			
			
			statement.setString(2, meeting.getTitle());
			statement.setString(3, meeting.getDate());
			statement.setDate(4, meeting.getStartTime());
			statement.setDate(5, meeting.getEndTime());
			statement.setString(6,meeting.getMeetingType());
			//execute statement
			

			
			statement.close();
			connection.close();
			
		}catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
	}

	@Override
	public Meeting getMeetingById(int id) {
		// TODO Auto-generated method stub
		Meeting meeting = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employee where id=?";
			PreparedStatement statement = ((Connection) connection).prepareStatement(sqlQuery);
			statement.setInt(1,id);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				
				String title = result.getString("title");
				//employee.setName(empName);
				
				String date= result.getString("date");

				Date startTime=result.getDate("startTime");
				//employee.setSalary(empSalary);

				
				Date endTime = result.getDate("endTime");
				//employee.setDob(empDOB.toLocalDate());
				
				String meetingType = result.getString("meetingType");
					
				meeting = new Meeting(title,date,startTime, endTime, meetingType);
			}
						
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return meeting;
	}

	@Override
	public Meeting getMeetingByName(String meetName) {
		
		Meeting meeting = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employee where name=?";
			PreparedStatement statement = ((Connection) connection).prepareStatement(sqlQuery);
			statement.setString(2,meetName);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				
				String title = result.getString("title");
				//employee.setName(empName);
				
				String date= result.getString("date");

				Date startTime=result.getDate("startTime");
				//employee.setSalary(empSalary);

				
				Date endTime = result.getDate("endTime");
				//employee.setDob(empDOB.toLocalDate());
				
				String meetingType = result.getString("meetingType");
					
				meeting = new Meeting(title,date,startTime, endTime, meetingType);
			}
						
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return meeting;
	}

	@Override
	public void deleteMeeting(int id) {
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
	public Set<Meeting> getAllMeeting() {
		Set<Meeting> meetings=null;
		Meeting meeting = null;
		try {
			Connection connection= DBUtil.getConnection();
			String sqlQuery = "select * from employee";
			PreparedStatement statement = ((Connection) connection).prepareStatement(sqlQuery);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				
				String title = result.getString("title");
				//employee.setName(empName);
				
				String date= result.getString("date");

				Date startTime=result.getDate("startTime");
				//employee.setSalary(empSalary);

				
				Date endTime = result.getDate("endTime");
				//employee.setDob(empDOB.toLocalDate());
				
				String meetingType = result.getString("meetingType");
					
				meeting = new Meeting(title,date,startTime, endTime, meetingType);
				meetings.add(meeting);
			}
						
			statement.close();
			result.close();
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return meetings;
	}
}



