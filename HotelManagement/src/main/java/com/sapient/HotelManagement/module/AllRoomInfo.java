package com.sapient.HotelManagement.module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.dao.DbUtilities;

public class AllRoomInfo {
	private static final Scanner sc  = new Scanner(System.in);
	public static String all_room_info()
	{
		String query = "Select * from tbl_room;";
		return query;
	}
	public void room_info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s", "Room_id", "Room_number", "Room_type_id", "Room_price", "Room_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Room_id");
                int r_number = resultSet.getInt("Room_number");
                String room_type_id = resultSet.getString("Room_type_id");
                int room_price = resultSet.getInt("Room_price");
                int room_status = resultSet.getInt("Room_status");
                System.out.format("%20s %20s %20s %20s %20s", r_id, r_number, room_type_id, room_price, room_status);
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
	public void available_room_info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room WHERE Room_status = 0;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s", "Room_id", "Room_number", "Room_type_id", "Room_price", "Room_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Room_id");
                int r_number = resultSet.getInt("Room_number");
                String room_type_id = resultSet.getString("Room_type_id");
                int room_price = resultSet.getInt("Room_price");
                int room_status = resultSet.getInt("Room_status");
                System.out.format("%20s %20s %20s %20s %20s", r_id, r_number, room_type_id, room_price, room_status);
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
	public void room_type_info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room_type;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %30s", "Room_type_id", "Room_type");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_type_id = resultSet.getInt("Room_type_id");
                String r_type = resultSet.getString("Room_type");
                System.out.format("%20s %30s", r_type_id, r_type);
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
	public void availableroom_particularType_info() {
		try {
			System.out.println("Enter Room type ID");
			int r_type_id = sc.nextInt();
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room Where Room_status = 0 AND Room_type_Id = "+r_type_id+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s", "Room_id", "Room_number", "Room_type_id", "Room_price", "Room_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Room_id");
                int r_number = resultSet.getInt("Room_number");
                String room_type_id = resultSet.getString("Room_type_id");
                int room_price = resultSet.getInt("Room_price");
                int room_status = resultSet.getInt("Room_status");
                System.out.format("%20s %20s %20s %20s %20s", r_id, r_number, room_type_id, room_price, room_status);
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
	public void occupied_particularType_info() {
		try {
			System.out.println("Enter Room type ID");
			int r_type_id = sc.nextInt();
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room Where Room_status = 1 AND Room_type_Id = "+r_type_id+";";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s", "Room_id", "Room_number", "Room_type_id", "Room_price", "Room_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Room_id");
                int r_number = resultSet.getInt("Room_number");
                String room_type_id = resultSet.getString("Room_type_id");
                int room_price = resultSet.getInt("Room_price");
                int room_status = resultSet.getInt("Room_status");
                System.out.format("%20s %20s %20s %20s %20s", r_id, r_number, room_type_id, room_price, room_status);
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
	public void occupied_room_info() {
		try {
            Statement statement = DbUtilities.getConnection().createStatement();
            String query = "Select * from tbl_room WHERE Room_status = 1;";
           // PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(query);
//            System.out.println(g.getName())
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%20s %20s %20s %20s %20s", "Room_id", "Room_number", "Room_type_id", "Room_price", "Room_status");
            System.out.println();
            while (resultSet.next()) 
            {
            	int r_id = resultSet.getInt("Room_id");
                int r_number = resultSet.getInt("Room_number");
                String room_type_id = resultSet.getString("Room_type_id");
                int room_price = resultSet.getInt("Room_price");
                int room_status = resultSet.getInt("Room_status");
                System.out.format("%20s %20s %20s %20s %20s", r_id, r_number, room_type_id, room_price, room_status);
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
