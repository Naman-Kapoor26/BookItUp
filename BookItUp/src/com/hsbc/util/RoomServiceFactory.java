package com.hsbc.util;

import com.hsbc.service.RoomService;
import com.hsbc.service.RoomServiceImpl;

public class RoomServiceFactory {
    public RoomService getRoomService(){
        RoomService roomservice = new RoomServiceImpl();
        return roomservice;

    }
    
}
