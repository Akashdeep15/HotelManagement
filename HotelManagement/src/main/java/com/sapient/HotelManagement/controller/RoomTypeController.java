package com.sapient.HotelManagement.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.RoomType;

public class RoomTypeController {
	
	private static  final Scanner sc= new Scanner(System.in);
	
	public void addRoomtype() {
		
		
		System.out.println("Room type room ");
		String room_type_room = sc.nextLine();
		addtodb(new RoomType(room_type_room));
		System.out.println("Room type details have been added");
		
	}
	
	public void addtodb(RoomType rt) {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_room_type(Room_type) values(?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
//            System.out.println(g.getName());
           
            pstm.setString(2, rt.getRoom_type());
           
            
            pstm.addBatch();
            pstm.executeBatch();

        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
        }

		
	}
}
