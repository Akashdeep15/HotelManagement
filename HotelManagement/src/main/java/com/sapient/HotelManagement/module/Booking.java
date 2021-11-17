package com.sapient.HotelManagement.module;

public class Booking {
	private int booking_id ;
	private int room_type_id	 ;
	private int guest_id	 ;
	private String check_in_datetime	 ;
	private String check_out_datetime	 ;
	/**
	 * @return the booking_id
	 */
	public int getBooking_id() {
		return booking_id;
	}
	/**
	 * @param booking_id the booking_id to set
	 */
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	/**
	 * @return the room_type_id
	 */
	public int getRoom_type_id() {
		return room_type_id;
	}
	/**
	 * @param room_type_id the room_type_id to set
	 */
	public void setRoom_type_id(int room_type_id) {
		this.room_type_id = room_type_id;
	}
	/**
	 * @return the guest_id
	 */
	public int getGuest_id() {
		return guest_id;
	}
	/**
	 * @param guest_id the guest_id to set
	 */
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	/**
	 * @return the check_in_datetime
	 */
	public String getCheck_in_datetime() {
		return check_in_datetime;
	}
	/**
	 * @param check_in_datetime the check_in_datetime to set
	 */
	public void setCheck_in_datetime(String check_in_datetime) {
		this.check_in_datetime = check_in_datetime;
	}
	/**
	 * @return the check_out_datetime
	 */
	public String getCheck_out_datetime() {
		return check_out_datetime;
	}
	/**
	 * @param check_out_datetime the check_out_datetime to set
	 */
	public void setCheck_out_datetime(String check_out_datetime) {
		this.check_out_datetime = check_out_datetime;
	}
	/**
	 * @param booking_id
	 * @param room_type_id
	 * @param guest_id
	 * @param check_in_datetime
	 * @param check_out_datetime
	 */
	public Booking(int booking_id, int room_type_id, int guest_id, String check_in_datetime,
			String check_out_datetime) {
		super();
		this.booking_id = booking_id;
		this.room_type_id = room_type_id;
		this.guest_id = guest_id;
		this.check_in_datetime = check_in_datetime;
		this.check_out_datetime = check_out_datetime;
	}
	

}


//Field Name Description Type Length
//Booking_id Booking ID Int 11
//Room_Type_id Room Type ID Int 11
//Guest_id Guest ID Int 11
//Check_in_datetime Check In of Date and Time Varchar 50
//Check_out_datetime Check Out of Date and Time Varchar
