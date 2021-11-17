package com.sapient.HotelManagement.module;

public class Payment {
	
	
	private int payment_id		;
	private int guest_id			;
	private int reservation_id			;
	private String add_on	;
	private int room_price;
	
	private int number_of_nights			;
	private int total_charges			;
	private int payment_status		;
	
	/**
	 * @return the payment_id
	 */
	public int getPayment_id() {
		return payment_id;
	}
	/**
	 * @param payment_id the payment_id to set
	 */
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
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
	 * @return the add_room
	 */
	public String getAdd_on() {
		return add_on;
	}
	/**
	 * @param add_room the add_room to set
	 */
	public void setAdd_on(String add_on) {
		this.add_on = add_on;
	}
	/**
	 * @return the number_of_nights
	 */
	
	/**
	 * @return the room_price
	 */
	public int getRoom_price() {
		return room_price;
	}
	
	public int getNumber_of_nights() {
		return number_of_nights;
	}
	
	public int getTotal_charges() {
		return total_charges;
	}
	
	public int getPayment_status() {
		return payment_status;
	}
	
	/**

	 * @param payment_id
	 * @param guest_id
	 * @param reservation_id
	 * @param add_on
	 * @param number_of_nights
	 * @param total_charges
	 * @param payment_status
	 */
	
	
	public Payment( int payment_id, int guest_id, int reservation_id, String add_on,int room_price,
			int number_of_nights, int total_charges, int payment_status) {
		super();
	
		this.payment_id = payment_id;
		this.guest_id = guest_id;
		this.reservation_id = reservation_id;
		this.add_on = add_on;
		this.room_price = room_price;
		this.number_of_nights = number_of_nights;
		this.total_charges = total_charges;
		this.payment_status = payment_status;
	}
	

}

//Field Name Description Type Length
//Payment_id Payment ID Int 11
//Guest_id Guest ID Int 11
//Reservation_id Reservation ID Int 11
//Add_On Add On the extra features Varchar 50
//Room_price Room Price Int 50
//Number_of_nights Number of nightsInt 11
//Total Total Charges Int 11
//Payment_status Payment status Int 1