package com.sapient.HotelManagement.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.Booking;
import com.sapient.HotelManagement.module.Reservation;

public class ReservationController {
	private static final Scanner sc  = new Scanner(System.in) ;
	
	public void addReservation() {
		
		System.out.println("Enter the Reservation ID");
		int reservation_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Room Id");
		int room_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Guest Id");
		int guest_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Check in");
		String check_in = sc.nextLine();
		
		
		System.out.println("Enter the check out");
		String check_out = sc.nextLine();
		
		System.out.println("Enter the reservation status");
		String reservation_status = sc.nextLine();
		
		// now calling the add to database method
		addtodb(new Reservation(reservation_id, room_id, guest_id, check_in, check_out, reservation_status) );
		
		System.out.println("Reservation added successfully");
		
	}
	
	public void addtodb(Reservation r) {
		try {
			Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_reservation values(?,?,?,?,?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
            pstm.setInt(1, r.getReservation_id());
            pstm.setInt(2,r.getRoom_id());
            pstm.setInt(3,r.getGuest_id());
            pstm.setString(4,r.getCheck_in());
            pstm.setString(5, r.getCheck_out());
            pstm.setString(6,r.getReservation());
            
            pstm.addBatch(); 		//Adding  all btch of all values at once 
            pstm.executeBatch();	// By this command we are here executing the sql quey
		}
		catch (SQLException throwables) {
            throwables.printStackTrace();
        }
	}

}

