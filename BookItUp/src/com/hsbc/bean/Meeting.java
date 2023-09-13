package com.hsbc.bean;

import java.time.LocalDate;

public class Meeting{
   
		private int meetingId;
		private String title;
		private String date;
		private LocalDate startTime;
		private LocalDate endTime;
		private String meetingType;
        
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
            final int prime = 31;
            int result = 1;
            result = prime * result + meetingId;
            return result;
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
            if (meetingId != other.meetingId)
                return false;
            return true;
        }
        
        @Override
        public String toString() {
            return "Meeting [meetingId=" + meetingId + ", title=" + title + ", date=" + date + ", startTime="
                    + startTime + ", endTime=" + endTime + ", meetingType=" + meetingType + "]";
        }


        

        

}
