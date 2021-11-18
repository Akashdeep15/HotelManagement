package com.sapient.HotelManagement.module;

public class RoomType {
	
	private String room_type;
	/**
	 * @return the room_type_id
	 */
	
	public String getRoom_type() {
		return room_type;
	}
	/**
	 * @param room_id the room_id to set
	 */
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	/**
	 * @param room_type_id
	 * @param room_id
	 */

	public RoomType(String room_type) {
		// TODO Auto-generated constructor stub
		this.room_type = room_type;
	}
	

}

//Field Name Description Type Length
//Room_type_id Room Type ID Int 11
//Room_typeRoom TypeVarchar 5