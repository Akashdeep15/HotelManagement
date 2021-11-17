package com.sapient.HotelManagement.module;

public class Guest {
	private int guest_id;
	private String first_name;
	private String last_name;
	private String address;
	private String phone_number;
	private String email_address;
	
	
	/**
	 * 
	 */
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param guest_id
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param phone_number
	 * @param email_address
	 */
	public Guest(int guest_id, String first_name, String last_name, String address, String phone_number,
			String email_address) {
		super();
		this.guest_id = guest_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
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
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	
	
	
	
//	Guest_id Guest ID Int 11
//	First_name Firstname Varchar 50
//	Last_name Lastname Varchar 50
//	Address Address Varchar 50
//	Phone_number Phone Number Varchar 50
//	Email_address Email Address Varchar

}
