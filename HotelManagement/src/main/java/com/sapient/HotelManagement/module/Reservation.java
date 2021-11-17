package com.sapient.HotelManagement.module;

public class Reservation {
	
	private int reservation_id ;
	private int room_id ;
	private int guest_id;
	private  String check_in;
	private String check_out ;
	private String reservation;
	
	/**
	 
	 * @param reservation_id
	 * @param room_id
	 * @param guest_id
	 * @param check_in
	 * @param check_out
	 * @param reservation
	 */
	public Reservation( int reservation_id, int room_id,int guest_id, String check_in, String check_out,
			String reservation) {
		super();
		
		this.reservation_id = reservation_id;
		this.room_id = room_id;
		this.guest_id = guest_id;
		this.check_in = check_in;
		this.check_out = check_out;
		this.reservation = reservation;
	}
	
	/**
	 * 
	 */
	

	/**
	 * @return the reservation_id
	 */
	public int getReservation_id() {
		return reservation_id;
	}
	/**
	 * @param reservation_id the reservation_id to set
	 */
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
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
	public String getReservation() {
		return reservation;
	}
	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation(String reservation) {
		this.reservation = reservation;
	} 

}
//

//Reservation_id Reservation ID Int 11
//Guest_id Guest ID Int 11
//Room_type_id Room Type ID Int 11
//6
//Check_in Check In Varchar 50
//Check_out Check Out Varchar 50
//Reservation_status Reservation Status I