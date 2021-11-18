package com.sapient.HotelManagement.consoles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.sapient.HotelManagement.controller.BookingController;
import com.sapient.HotelManagement.controller.GuestController;
import com.sapient.HotelManagement.controller.PaymentController;
import com.sapient.HotelManagement.controller.ReservationController;
import com.sapient.HotelManagement.module.AllGuestInfo;
import com.sapient.HotelManagement.module.AllPaymentInfo;
import com.sapient.HotelManagement.module.AllRoomInfo;

public class FrontConsole {
	public static Scanner sc = new Scanner(System.in);
	public static void clearConsole() {
		System.out.println(System.lineSeparator().repeat(100));
	}
	public static void Console0() throws Exception
	{
		System.out.println("Select Login Type by pressing 1 or 2");
		System.out.println("1. Owner");
		System.out.println("2. Manager");
		Scanner sc = new Scanner(System.in);
		int key0 = sc.nextInt();
		KeyAction0(key0);
	}
	public static void Console1() throws Exception
	{
		System.out.println("Main Menu - Press key for following operations");
		System.out.format("%40s %40s","1. New Guest Form                    ","5. Cancel Booking    ");
		System.out.println();
		System.out.format("%40s %40s","2. View and Update Guest information ","6. Reservation Chart ");
		System.out.println();
		System.out.format("%40s %40s","3. View Rooms                        ","7. Payment           ");
		System.out.println();
		System.out.format("%40s %40s","4. New Booking                       ","8. Other Services    ");
		System.out.println();
		System.out.format("%40s","0. Logout                            ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int key1 = sc.nextInt();
		KeyAction1(key1);
	}
	public static void Console2() throws Exception
	{
		System.out.println("1. All Guest information");
		System.out.println("2. Search Guest by Guest ID");
		System.out.println("3. Search Guest by First Name");
		System.out.println("4. Update Guest Mobile Number");
		System.out.println("0. Go to Main Menu");
		Scanner sc = new Scanner(System.in);
		int key2 = sc.nextInt();
		KeyAction2(key2);
	}
	public static void Console3() throws Exception
	{
		System.out.println("1. Room Types");
		System.out.println("2. All Rooms");
		System.out.println("3. All Rooms Available");
		System.out.println("4. Available Rooms of particular type");
		System.out.println("5. All rooms Occupied");
		System.out.println("6. Rooms Occupied of particular type");
		System.out.println("0. Go to Main Menu");
		Scanner sc = new Scanner(System.in);
		int key3 = sc.nextInt();
		KeyAction3(key3);
	}
	
	public static void Console4() throws Exception {
		System.out.println("1. Pay Bill");
		System.out.println("2. Payment Chart");
		System.out.println("3. Search Payment Status by Guest ID");
		System.out.println("0. Go to Main Menu");
		Scanner sc = new Scanner(System.in);
		int key4 = sc.nextInt();
		KeyAction4(key4);
		
	}
	public static void Console5() throws Exception {
		System.out.println("1. Opt in Hotel Services");
		System.out.println("2. Food Ordering");
		System.out.println("3. Redeem Discount Coupons");
		System.out.println("0. Go to Main Menu");
		Scanner sc = new Scanner(System.in);
		int key5 = sc.nextInt();
		KeyAction5(key5);
	}
	public static void KeyAction5(int key) throws Exception
	{
		if (key == 1)
		{
			System.out.println("You can opt for Spa/Sports and events");
		}
		if (key == 2)
		{
			System.out.println("You can order Food");
		}
		if (key == 3)
		{
			System.out.println("You can redeem Discount Coupons ");
		}
		if (key == 0)
		{
			Console1();
		}
		else
		{
			System.out.println("Wrong Key Entered");
		}
		gobacktoConsole5();
	}
	public static void KeyAction4(int key) throws Exception
	{
		if (key == 1)
		{
			PaymentController payment_controller = new PaymentController();
			payment_controller.addPayment();
		}
		if (key == 2)
		{
			AllPaymentInfo info = new AllPaymentInfo();
			info.payment_info();
		}
		if(key == 3)
		{
			AllPaymentInfo info = new AllPaymentInfo();
			info.payment_info_by_id();
		}
		
		if(key == 0)
		{
			Console1();
		}
		else
		{
			System.out.println("Wrong Key Pressed");
		}
		gobacktoConsole4();
	}
	public static void KeyAction3(int key) throws Exception
	{
		//System.out.print("\033[H\033[2J");  
		//System.out.flush();
		if (key == 1)
			{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.room_type_info();
			}
		if (key == 2)
		{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.room_info();
		}
		if (key == 3)
		{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.available_room_info();
		}
		if (key == 4)
		{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.availableroom_particularType_info();
			
		}
		if (key == 5)
		{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.occupied_room_info();
		}
		if (key == 6)
		{
			AllRoomInfo allrooms = new AllRoomInfo();
			allrooms.occupied_particularType_info();
		}
		if (key == 0)
		{
			Console1();
		}
		else
		{
			System.out.println();
		}
		gobacktoConsole3();
				
	}
	public static void KeyAction2(int key) throws Exception
	{
		//System.out.print("\033[H\033[2J");  
		//System.out.flush();
		if (key == 1)
			{
			AllGuestInfo AgI = new AllGuestInfo();
			AgI.info();
			}
		if (key == 2)
		{
			AllGuestInfo AgI = new AllGuestInfo();
			AgI.searchGuestbyGuestID();
		}
		if (key == 3)
		{
			AllGuestInfo AgI = new AllGuestInfo();
			AgI.searchGuestbyGuestName();
		}
		if (key == 4)
		{
			AllGuestInfo AgI = new AllGuestInfo();
			AgI.updateGuestPhoneNumber();
		}
		if (key == 0)
		{
			Console1();
		}
		gobacktoConsole2();
				
	}
	public static void KeyAction1(int key) throws Exception
	{
		//System.out.print("\033[H\033[2J");  
		//System.out.flush();
		if (key == 1)
			{
			GuestController guestController = new GuestController();
	    	guestController.addGuest();
			}
		if (key == 2)
		{
			Console2();
		}
		if (key == 3)
		{
			Console3();
		}
		if (key == 4)
		{
			BookingController bookingController = new BookingController();
			bookingController.addBooking();
		}
		if (key == 5)
		{
			BookingController bookingController = new BookingController();
			bookingController.cancelBooking();
		}
		if (key == 6)
		{
			ReservationController res_controller = new ReservationController();
			res_controller.addReservation();
		}
		if (key == 7)
		{
			Console4();
		}
		if (key == 8)
		{
			Console5();			
		}
		if (key == 0)
		{
			System.out.println("Relaunch Again for starting Application");
		}
		gobacktoConsole1();
	}
	public static void KeyAction0(int key) throws Exception
	{
		if (key == 1)
		{
			System.out.println("This is Owner's Login ");
			System.out.println("Enter Password");
			String pwd = sc.nextLine();
			userAuthentication1(pwd);
		}
		if (key == 2)
		{
			System.out.println("This is Manager's Login ");
			System.out.println("Enter Password");
			String pwd = sc.nextLine();
			userAuthentication2(pwd);
		}
		else
		{
			System.out.println("Wrong key pressed");
			Console0();
		}
	}
	public static void gobacktoConsole5() throws Exception
	{
		System.out.println("Press 0 to go back to previous menu");
		Scanner sc = new Scanner(System.in);
		int back_key = sc.nextInt();
		if (back_key == 0 )
		{
			Console5();
		}
		else
		{
			System.out.println("wrong Key pressed");
			gobacktoConsole5();
		}
	}
	public static void gobacktoConsole4() throws Exception
	{
		System.out.println("Press 0 to go back to previous menu");
		Scanner sc = new Scanner(System.in);
		int back_key = sc.nextInt();
		if (back_key == 0 )
		{
			Console4();
		}
		else
		{
			System.out.println("wrong Key pressed");
			gobacktoConsole4();
		}
	}
	public static void gobacktoConsole2() throws Exception
	{
		System.out.println("Press 0 to go back to previous menu");
		Scanner sc = new Scanner(System.in);
		int back_key = sc.nextInt();
		if (back_key == 0 )
		{
			Console2();
		}
		else
		{
			System.out.println("wrong Key pressed");
			gobacktoConsole2();
		}
	}
	public static void gobacktoConsole3() throws Exception
	{
		System.out.println("Press 0 to go back to previous menu");
		Scanner sc = new Scanner(System.in);
		int back_key = sc.nextInt();
		if (back_key == 0 )
		{
			Console3();
		}
		else
		{
			System.out.println("wrong Key pressed");
			gobacktoConsole3();
		}
	}
	public static void gobacktoConsole1() throws Exception
	{
		System.out.println("Press 0 to go back to previous menu");
		Scanner sc = new Scanner(System.in);
		int back_key = sc.nextInt();
		if (back_key == 0 )
		{
			Console1();
		}
		else
		{
			System.out.println("wrong Key pressed");
			gobacktoConsole1();
		}
	}
	public static void userAuthentication1(String p) throws Exception
	{
		if (p.equals("TeamB/Owner"))
		{
			System.out.println("Login Successful");
			Console1();
		}
		else
		{
			System.out.println("Wrong Password");
			Console0();
		}
	}
	public static void userAuthentication2(String p) throws Exception
	{
		if (p.equals("TeamB/Manager"))
		{
			System.out.println("Login Successful");
			Console1();
		}
		else
		{
			System.out.println("Wrong Password");
			Console0();
		}
	}
	public static void main(String[] args) throws Exception 
	{
		//Scanner sc = new Scanner(System.in);
		//int key1 = sc.nextInt();
		//System.out.print("\u000C");  
		//System.out.flush();
		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		//KeyAction1(key1);
	}

}
