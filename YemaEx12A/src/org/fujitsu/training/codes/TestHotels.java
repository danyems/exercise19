package org.fujitsu.training.codes;

public class TestHotels {
	
	public static void main(String[] args) {
		Dimension di1 = new Dimension();
		Dimension di2 = new Dimension(30,30);
		Dimension di3 = new Dimension(20,20);
		
		Room room1 = new Room(100, (byte) 3, di1);
		Room room2 = new Room(400, (byte) 5, di3);
		Room room3 = new Room(800, (byte) 10, di2);

		Hotel hotel1 = new Hotel(room1, room2, room3);
		Hotel hotel2 = new Hotel(room1, room2);
		Hotel hotel3 = new Hotel(room1, room2, room3);
		Hotel hotel4 = new Hotel(room1);
		Hotel hotel5 = new Hotel(room1, room2);
		
		
	}

}
