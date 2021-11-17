package com.sapient.HotelManagement.module;

public class RoomType {
	private int room_type_id;
	private String room_type_room;
	/**
	 * @param room_type_id
	 * @param room_type_room
	 */
	public RoomType(int room_type_id, String room_type_room) {
		super();
		this.room_type_id = room_type_id;
		this.room_type_room = room_type_room;
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
	 * @return the room_type_room
	 */
	public String getRoom_type_room() {
		return room_type_room;
	}
	/**
	 * @param room_type_room the room_type_room to set
	 */
	public void setRoom_type_room(String room_type_room) {
		this.room_type_room = room_type_room;
	}

}
