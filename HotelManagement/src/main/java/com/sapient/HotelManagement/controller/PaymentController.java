package com.sapient.HotelManagement.controller;



//import java.sql.Statement;
import java.util.Scanner;



import com.sapient.HotelManagement.dao.DbUtilities;
import com.sapient.HotelManagement.module.Payment;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class PaymentController {
private static final Scanner sc= new Scanner(System.in);
public void addPayment() {



System.out.println("Enter Payment id");
int payment_id = sc.nextInt();
sc.nextLine();

System.out.println("Enter Guest id");
int guest_id = sc.nextInt();
sc.nextLine();

System.out.println("Enter Reservation id");
int reservation_id = sc.nextInt();
sc.nextLine();

System.out.println("Enter Add On");
String add_on = sc.nextLine();


System.out.println("Enter Room Price");
int room_price = sc.nextInt();
sc.nextLine();

System.out.println("Enter Total No. of Nights");
int total_nights = sc.nextInt();
sc.nextLine();

System.out.println("Enter Total Charges");
int total_charges = sc.nextInt();
sc.nextLine();

System.out.println("Enter Payment Status");
int payment_status = sc.nextInt();
sc.nextLine();






addtopay(new Payment(payment_id,guest_id, reservation_id,add_on, room_price, total_nights,total_charges,payment_status));
System.out.println("Guest has been registered successfully");



}
public void addtopay(Payment g) {
try {
Statement statement = DbUtilities.getConnection().createStatement();
String sqlQuery="insert into tbl_payment values(?,?,?,?,?,?,?,?)";
// String sqlQuery = "update tbl_guest set first_name='Rohit' where emp_id=1";
PreparedStatement pstm= DbUtilities.getConnection().prepareStatement(sqlQuery);
// System.out.println(g.getName());
pstm.setInt(1, g.getPayment_id());
pstm.setInt(2,g.getGuest_id());
pstm.setInt(3,g.getReservation_id());
pstm.setString(4, g.getAdd_on());
pstm.setInt(5,g.getRoom_price());
pstm.setInt(6,g.getNumber_of_nights());
pstm.setInt(7,g.getTotal_charges());
pstm.setInt(8,g.getPayment_status());

pstm.addBatch();



pstm.executeBatch();



}
catch (SQLException throwables) {
throwables.printStackTrace();
}




}



}