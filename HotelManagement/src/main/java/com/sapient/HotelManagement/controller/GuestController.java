package com.sapient.HotelManagement.controller;

//import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.Guest;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class GuestController {

	private static  final Scanner sc= new Scanner(System.in);
	
	public void addGuest() {
		System.out.println("First Name");
		String first_name = sc.nextLine();
		
		System.out.println("Last Name ");
		String last_name = sc.nextLine();
		
		
		System.out.println("Address");
		String address = sc.nextLine();
		
		
		System.out.println("Phone Number");
		String phone_number = sc.nextLine();
		
		
		System.out.println("Email Address");
		String email_address = sc.nextLine();
		
		addtodb(new Guest(first_name, last_name,address, phone_number, email_address));
		System.out.println("Guest has been registered successfully");

	}
	public void addtodb(Guest g) {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String sqlQuery="insert into tbl_guest(First_name,Last_name ,Address,Phone_number,Email_address) values(?,?,?,?,?)";
            PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
//            System.out.println(g.getName());
        
            pstm.setString(1,g.getFirst_name());
            pstm.setString(2,g.getLast_name());
            pstm.setString(3, g.getAddress());
            pstm.setString(4,g.getPhone_number());
            pstm.setString(5,g.getEmail_address());
            pstm.addBatch();

            pstm.executeBatch();

        }         catch (SQLException throwables) {
            throwables.printStackTrace();
        }

		
	}

}
