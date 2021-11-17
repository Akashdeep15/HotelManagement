package com.sapient.HotelManagement;

import com.sapient.HotelManagement.controller.BookingController;
import com.sapient.HotelManagement.controller.GuestController;
import com.sapient.HotelManagement.controller.PaymentController;
import com.sapient.HotelManagement.controller.ReservationController;
import com.sapient.HotelManagement.controller.RoomController;
import com.sapient.HotelManagement.controller.RoomTypeController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	GuestController guestController = new GuestController();
//    	guestController.addGuest();
    	
   	System.out.println("Now Enter the Booking Information");
    	 
 BookingController bookingController = new BookingController();
    	bookingController.addBooking();
//    	
//    
//    	System.out.println("Now the enter the Reservation Information");
//    	ReservationController reservationController = new ReservationController();
//    	reservationController.addReservation();
    	
    	
//    	//For room table
//    	System.out.println("Enter the room details");
//    	RoomController roomController = new RoomController();
//    	roomController.addRoom();
    	
//    	for Payment
//    	System.out.println("Enter the payment details");
//    	PaymentController paymentController = new PaymentController();
//    	paymentController.addPayment();
    
//    	For room type
//    	System.out.println("Enter the room type details");
//    	RoomTypeController roomTypeController = new RoomTypeController();
//    	roomTypeController.addRoomtype();
//    	
    	
    }
}
