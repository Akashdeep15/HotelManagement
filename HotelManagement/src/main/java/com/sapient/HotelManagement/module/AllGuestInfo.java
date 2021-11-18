package com.sapient.HotelManagement.module;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;

public class AllGuestInfo {
	private static final Scanner sc  = new Scanner(System.in);
	public static String all_Guests_info()
	{
		String query = "Select * from tbl_guest;";
		return query;
	}
	public void info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_guest;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%5s %20s %20s %20s %20s %20s", "Guest_id", "First_name", "Last_name", "Address", "Phone_number","Email_address");
            System.out.println();
            while (resultSet.next()) 
            {
            	int g_id = resultSet.getInt("Guest_id");
                String f_name = resultSet.getString("First_name");
                String l_name = resultSet.getString("Last_name");
                String address = resultSet.getString("Address");
                int phone_number = resultSet.getInt("Phone_number");
                String email_id = resultSet.getString("Email_address");
                System.out.format("%5s %20s %20s %20s %20s %20s", g_id, f_name, l_name, address, phone_number, email_id);
                System.out.println();
                /*
                if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{name, roll, dept});//Adding row in Table
                    frame2.setVisible(true);//Setting the visibility of second Frame
                    frame2.validate();
                    break;
                }
                */
            }
           // pstm.executeBatch();

        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
        }		
	}
	public void searchGuestbyGuestID()
	{
		try {
			System.out.println("Enter the Guest Id");
			int g_id = sc.nextInt();
			sc.nextLine();
			Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_guest Where guest_id = "+g_id+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%5s %20s %20s %20s %20s %20s", "Guest_id", "First_name", "Last_name", "Address", "Phone_number","Email_address");
            System.out.println();
            while (resultSet.next()) 
            {
            	int gu_id = resultSet.getInt("Guest_id");
                String f_name = resultSet.getString("First_name");
                String l_name = resultSet.getString("Last_name");
                String address = resultSet.getString("Address");
                int phone_number = resultSet.getInt("Phone_number");
                String email_id = resultSet.getString("Email_address");
                System.out.format("%5s %20s %20s %20s %20s %20s", gu_id, f_name, l_name, address, phone_number, email_id);
                System.out.println();
                /*
                if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{name, roll, dept});//Adding row in Table
                    frame2.setVisible(true);//Setting the visibility of second Frame
                    frame2.validate();
                    break;
                }
                */
            }
           // pstm.executeBatch();

        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
         }
	}
	public void searchGuestbyGuestName()
	{
		try {
			System.out.println("Enter First name");
			String fi_name = sc.nextLine();
			//sc.nextLine();
			Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_guest Where first_name = "+fi_name+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%5s %20s %20s %20s %20s %20s", "Guest_id", "First_name", "Last_name", "Address", "Phone_number","Email_address");
            System.out.println();
            while (resultSet.next()) 
            {
            	int gu_id = resultSet.getInt("Guest_id");
                String f_name = resultSet.getString("First_name");
                String l_name = resultSet.getString("Last_name");
                String address = resultSet.getString("Address");
                int phone_number = resultSet.getInt("Phone_number");
                String email_id = resultSet.getString("Email_address");
                System.out.format("%5s %20s %20s %20s %20s %20s", gu_id, f_name, l_name, address, phone_number, email_id);
                System.out.println();
                /*
                if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{name, roll, dept});//Adding row in Table
                    frame2.setVisible(true);//Setting the visibility of second Frame
                    frame2.validate();
                    break;
                }
                */
            }
           // pstm.executeBatch();

        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
         }
	}
	public void updateGuestPhoneNumber()
	{
		try {
			System.out.println("Enter Guest ID");
			int g_id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter New Phone number");
			String p_number = sc.nextLine();
			Statement statement = DbUtilities.getConnection().createStatement();
            String query = "UPDATE tbl_guest SET phone_number = "+p_number+" Where guest_id = "+g_id+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            statement.executeUpdate(query);
            }
         catch (SQLException throwables) {
            throwables.printStackTrace();
         }
	}
}