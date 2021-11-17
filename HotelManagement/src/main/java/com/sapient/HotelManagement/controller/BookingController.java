package com.sapient.HotelManagement.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.Booking;

public class BookingController {
	private static final Scanner sc  = new Scanner(System.in) ;
	
	public void addBooking() {
		
		System.out.println("Enter the Booking ID");
		int booking_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Room Type Id");
		int room_type_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Guest Id");
		int guest_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Check in datetime");
		String check_in_datetime = sc.nextLine();
		
		
		System.out.println("Enter the check out time");
		String check_out_date = sc.nextLine();
		addtodb(new Booking(booking_id, room_type_id, guest_id, check_in_datetime, check_out_date));
		System.out.println("Booking added successfully");
		
	}
	
	public void addtodb(Booking b) {
		try {
			Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_booking values(?,?,?,?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
            pstm.setInt(1, b.getBooking_id());
            pstm.setInt(2,b.getRoom_type_id());
            pstm.setInt(3,b.getGuest_id());
            pstm.setString(4, b.getCheck_in_datetime());
            pstm.setString(5,b.getCheck_out_datetime());
            
            pstm.addBatch(); 		//Adding  abtch of all values at once 
            pstm.executeBatch();	// By this command we are here executing the sql quey
		}
		catch (SQLException throwables) {
            throwables.printStackTrace();
        }
	}

}
