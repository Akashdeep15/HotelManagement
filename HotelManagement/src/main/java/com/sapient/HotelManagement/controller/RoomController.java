package com.sapient.HotelManagement.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.Room;

public class RoomController {
	
	private static  final Scanner sc= new Scanner(System.in);
	public void addRoom() {
		
		System.out.println("Enter Room id");
		int room_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Room number id");
		int room_number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Room type id");
		int room_type_id = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Room Price");
		int room_price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Room Status");
		String room_status = sc.nextLine();
		
		addtodb(new Room(room_id, room_number, room_type_id, room_price, room_status));
		System.out.println("Room details have been entered");
	}
	
	public void addtodb(Room r) {
		try {
			Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_room values(?,?,?,?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
            pstm.setInt(1, r.getRoom_id());
            pstm.setInt(2,r.getRoom_number());
            pstm.setInt(3,r.getRoom_type_id());
            pstm.setInt(4,r.getRoom_price());
            pstm.setString(5, r.getRoom_status());
            
            
            pstm.addBatch();
            pstm.executeBatch();
		}
		
		catch (SQLException throwables) {
            throwables.printStackTrace();
        }
	}
	
	

}
