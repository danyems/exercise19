package org.fujitsu.training.codes;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private String name;
	private List<Room> rooms = new ArrayList<>();
	
	
	public Hotel(Room room1) {
		this.rooms.add(room1);

	}
	public Hotel(Room room1, Room room2) {
		this(room1);
		this.rooms.add(room1);
		this.rooms.add(room2);
	}
	public Hotel(Room room1, Room room2, Room room3) {
		this(room1, room2);
		this.rooms.add(room3);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {

		return super.toString();
	}
}
