package com.sapient.HotelManagement.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public void showReservation() {
		try {
			Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="Select * From tbl_reservation";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            System.out.printf("%11s %11s %11s %50s %50s %11s", "Reservation_id", "Guest_id", "Room_type_id", "Check_in", "Check_out","Reservation_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Reservation_id");
            	int g_id = resultSet.getInt("Guest_id");
            	int room_type_id = resultSet.getInt("Room_type_id");
                String check_in = resultSet.getString("Check_in");
                String check_out = resultSet.getString("Check_out");
                int r_status = resultSet.getInt("Reservation_status");
                System.out.format("%11s %11s %11s %50s %50s %11s", r_id, g_id, room_type_id, check_in, check_out, r_status);
                System.out.println();
            
		}
		catch (SQLException throwables) {
            throwables.printStackTrace();
        }
	}

}

