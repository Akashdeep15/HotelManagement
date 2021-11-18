package com.sapient.HotelManagement.module;

public class Reservation {

	private int guest_id ;
	private int room_id ;
	private  String check_in;
	private String check_out ;
	private int reservation;
	/**
	 * @return the field_name
	 */

	/**
	 * @param field_name
	 * @param reservation_id
	 * @param room_id
	 * @param guest_id 
	 * @param check_in
	 * @param check_out
	 * @param reservation
	 */
	public Reservation( int guest_id, int room_id, String check_in, String check_out,
			int reservation) {
		super();
		
		this.guest_id = guest_id;
		this.room_id = room_id;
		this.check_in = check_in;
		this.check_out = check_out;
		this.reservation = reservation;
	}
	/**
	 * @param field_name the field_name to set
	 */

	/**
	 * @return the reservation_id
	 */
	public int getGuest_id() {
		return guest_id;
	}
	/**
	 * @param reservation_id the reservation_id to set
	 */
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	/**
	 * @return the room_id
	 */
	public int getRoom_id() {
		return room_id;
	}
	/**
	 * @param room_id the room_id to set
	 */
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	/**
	 * @return the check_in
	 */
	public String getCheck_in() {
		return check_in;
	}
	/**
	 * @param check_in the check_in to set
	 */
	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}
	/**
	 * @return the check_out
	 */
	public String getCheck_out() {
		return check_out;
	}
	/**
	 * @param check_out the check_out to set
	 */
	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}
	/**
	 * @return the reservation
	 */
	public int getReservation_Status() {
		return reservation;
	}
	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation_Status(int reservation) {
		this.reservation = reservation;
	} 

}
//
//Field Name Description Type Length
//Reservation_id Reservation ID Int 11
//Guest_id Guest ID Int 11
//Room_type_id Room Type ID Int 11
//6
//Check_in Check In Varchar 50
//Check_out Check Out Varchar 50
//Reservation_status Reservation Status I