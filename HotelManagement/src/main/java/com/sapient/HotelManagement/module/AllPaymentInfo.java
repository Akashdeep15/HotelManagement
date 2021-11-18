package com.sapient.HotelManagement.module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;

public class AllPaymentInfo {
	public static Scanner sc = new Scanner(System.in);
	public void payment_info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_payment;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "Payment_id", "Guest_id","Reservation_id", "Add_On", "Room_price", "Number_of_nights","Total");
            System.out.println();
            while (resultSet.next()) 
            {
            	int p_id = resultSet.getInt("Payment_id");
            	int g_id = resultSet.getInt("Guest_id");
                int r_id = resultSet.getInt("Reservation_id");
                String add_on = resultSet.getString("Add_On");
                int room_price = resultSet.getInt("Room_price");
                int Number_of_nights = resultSet.getInt("Number_of_nights");
                int total = resultSet.getInt("Total");
                System.out.format("%20s %20s %20s %20s %20s %20s %20s", p_id, g_id, r_id, add_on, room_price,Number_of_nights, total);
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
	public void payment_info_by_id() {
		try {
			System.out.println("Enter Guest ID");
			int id = sc.nextInt();
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_payment Where guest_id = "+id+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "Payment_id", "Guest_id","Reservation_id", "Add_On", "Room_price", "Number_of_nights","Total");
            System.out.println();
            while (resultSet.next()) 
            {
            	int p_id = resultSet.getInt("Payment_id");
            	int g_id = resultSet.getInt("Guest_id");
                int r_id = resultSet.getInt("Reservation_id");
                String add_on = resultSet.getString("Add_On");
                int room_price = resultSet.getInt("Room_price");
                int Number_of_nights = resultSet.getInt("Number_of_nights");
                int total = resultSet.getInt("Total");
                System.out.format("%20s %20s %20s %20s %20s %20s %20s", p_id, g_id, r_id, add_on, room_price,Number_of_nights, total);
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

}
