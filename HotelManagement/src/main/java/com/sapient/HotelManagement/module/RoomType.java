package com.sapient.HotelManagement.module;

public class RoomType {
	private int room_type_id;
	private String room_id;
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
	 * @return the room_id
	 */
	public String getRoom_id() {
		return room_id;
	}
	/**
	 * @param room_id the room_id to set
	 */
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	/**
	 * @param room_type_id
	 * @param room_id
	 */
	public RoomType(int room_type_id, String room_id) {
		super();
		this.room_type_id = room_type_id;
		this.room_id = room_id;
	}
	

}

//Field Name Description Type Length
//Room_type_id Room Type ID Int 11
//Room_typeRoom TypeVarchar 5