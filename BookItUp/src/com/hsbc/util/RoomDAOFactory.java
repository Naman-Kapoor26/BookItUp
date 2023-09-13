package com.hsbc.util;

import com.hsbc.dao.RoomDAO;
import com.hsbc.dao.RoomDAOImpl;

public class RoomDAOFactory {
    public RoomDAO getRoomDAO(){
        RoomDAO roomdao = new RoomDAOImpl();
        return roomdao;
    }
    
}
