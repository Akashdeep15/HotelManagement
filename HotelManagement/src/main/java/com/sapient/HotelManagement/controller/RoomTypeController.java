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
		System.out.println("Enter Room Type Id ");
		int room_type_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Room type room ");
		String room_type_room = sc.nextLine();
		addtodb(new RoomType(room_type_id, room_type_room));
		System.out.println("Room type details have been added");
		
	}
	
	public void addtodb(RoomType rt) {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_room_type values(?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
//            System.out.println(g.getName());
            pstm.setInt(1, rt.getRoom_type_id());
            pstm.setString(2, rt.getRoom_type_room());
           
            
            pstm.addBatch();
            pstm.executeBatch();

        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
        }

		
	}
}
