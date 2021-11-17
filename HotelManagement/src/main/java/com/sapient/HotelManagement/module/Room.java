package com.sapient.HotelManagement.module;

public class Room {

private int room_id					;
private int room_number					;
private int room_type_id;

private int room_price 					;
private String room_status 					;

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
 * @return the room_number
 */
public int getRoom_number() {
	return room_number;
}
/**
 * @param room_number the room_number to set
 */
public void setRoom_number(int room_number) {
	this.room_number = room_number;
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
 * @return the room_price
 */
public int getRoom_price() {
	return room_price;
}
/**
 * @param room_price the room_price to set
 */
public void setRoom_price(int room_price) {
	this.room_price = room_price;
}
/**
 * @return the room_status
 */
public String getRoom_status() {
	return room_status;
}
/**
 * @param room_status the room_status to set
 */
public void setRoom_status(String room_status) {
	this.room_status = room_status;
}
/**

 * @param room_id
 * @param room_number
 *  @param room_type_id
 * @param room_price
 * @param room_status
 */
public Room( int room_id, int room_number, int room_type_id, int room_price, String room_status) {
	super();
	
	this.room_id = room_id;
	this.room_number = room_number;
	this.room_price = room_price;
	this.room_status = room_status;
	this.room_type_id = room_type_id;
}
/**
 *
 */


	
}


//Field Name Description Type Length
//Room_id Room ID Int 11
//Room_number Room Number Int 11
//Room_type_Id Room Type ID Varchar 50
//Room_price Room Price Int 11
//Room_status Room Status Int 11