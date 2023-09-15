package com.hsbc.bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Meeting{
   
		private int meetingId;
		private String title;
		private String date;
		private LocalDate startTime;
		private LocalDate endTime;
		private String meetingType;
        
		
		
        

		public Meeting(String title, String date, Date startTime, Date endTime,
				String meetingType) {
			super();
			this.title = title;
			this.date = date;
			this.startTime = startTime;
			this.endTime = endTime;
			this.meetingType = meetingType;
		}

		public int getMeetingId() {
            return meetingId;
        }
        
        public void setMeetingId(int meetingId) {
            this.meetingId = meetingId;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
        public LocalDate getStartTime() {
            return startTime;
        }
        public void setStartTime(LocalDate startTime) {
            this.startTime = startTime;
        }
        public LocalDate getEndTime() {
            return endTime;
        }
        public void setEndTime(LocalDate endTime) {
            this.endTime = endTime;
        }
        public String getMeetingType() {
            return meetingType;
        }
        public void setMeetingType(String meetingType) {
            this.meetingType = meetingType;
        }
        
        
        @Override
		public int hashCode() {
			return Objects.hash(meetingId, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Meeting other = (Meeting) obj;
			return meetingId == other.meetingId && Objects.equals(title, other.title);
		}

		@Override
        public String toString() {
            return "Meeting [meetingId=" + meetingId + ", title=" + title + ", date=" + date + ", startTime="
                    + startTime + ", endTime=" + endTime + ", meetingType=" + meetingType + "]";
        }


        

        

}
