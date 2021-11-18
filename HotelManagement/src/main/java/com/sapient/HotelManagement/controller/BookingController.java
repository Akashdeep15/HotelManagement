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
		addtodb(new Booking(room_type_id, guest_id, check_in_datetime, check_out_date));
		System.out.println("Booking added successfully");
		
	}
	
	public void addtodb(Booking b) {
		try {
			Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_booking(Room_type,Guest_id,Check_in_datetime,Check_out_datetime) values(?,?,?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
           
            pstm.setInt(1,b.getRoom_type_id());
            pstm.setInt(2,b.getGuest_id());
            pstm.setString(3, b.getCheck_in_datetime());
            pstm.setString(4,b.getCheck_out_datetime());
            
            pstm.addBatch(); 		//Adding  abtch of all values at once 
            pstm.executeBatch();	// By this command we are here executing the sql quey
		}
		catch (SQLException throwables) {
            throwables.printStackTrace();
        }
	}
	
	public void cancelBooking() throws SQLException
	{
		System.out.println("Enter the Booking ID");
		int b_id = sc.nextInt();
		sc.nextLine();
		Statement statement = DbUtilities.getConnection().createStatement();
		String sqlQuery="DELETE FROM tbl_booking WHERE Booking_id = "+b_id+";";
		statement.executeUpdate(sqlQuery); 
		System.out.println("Booking Cancelled");
	}

}
