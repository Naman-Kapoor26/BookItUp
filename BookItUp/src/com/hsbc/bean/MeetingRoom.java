package com.hsbc.bean;

public class MeetingRoom {

    private String room_name;
    private int seat_capacity;
    private double reviews; //Out of 5
    //Amenities
    private boolean hasProjector;
    private boolean hasWifi;
    private boolean hasConfCall;
    private boolean hasBoard;
    private boolean hasWater;
    private boolean hasTV;
    private boolean hasCoffee;

    public MeetingRoom(String room_name, int seat_capacity, double reviews, boolean hasProjector, boolean hasWifi,
            boolean hasConfCall, boolean hasBoard, boolean hasWater, boolean hasTV, boolean hasCoffee) {
        this.room_name = room_name;
        this.seat_capacity = seat_capacity;
        this.reviews = reviews;
        this.hasProjector = hasProjector;
        this.hasWifi = hasWifi;
        this.hasConfCall = hasConfCall;
        this.hasBoard = hasBoard;
        this.hasWater = hasWater;
        this.hasTV = hasTV;
        this.hasCoffee = hasCoffee;
    }

    @Override
    public String toString() {
        return "MeetingRoom [room_name=" + room_name + ", seat_capacity=" + seat_capacity + ", reviews=" + reviews
                + ", hasProjector=" + hasProjector + ", hasWifi=" + hasWifi + ", hasConfCall=" + hasConfCall
                + ", hasBoard=" + hasBoard + ", hasWater=" + hasWater + ", hasTV=" + hasTV + ", hasCoffee=" + hasCoffee
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((room_name == null) ? 0 : room_name.hashCode());
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
        MeetingRoom other = (MeetingRoom) obj;
        if (room_name == null) {
            if (other.room_name != null)
                return false;
        } else if (!room_name.equals(other.room_name))
            return false;
        return true;
    }

    
    





    

}
