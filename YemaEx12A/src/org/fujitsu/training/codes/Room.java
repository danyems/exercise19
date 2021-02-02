package org.fujitsu.training.codes;

public class Room {
	
	private Float hourlyRate;
	private Byte capacity;
	private Dimension dimension;

	public Room(float hourlyRate, byte capacity, Dimension dimension) {
		this.hourlyRate = hourlyRate;
		this.capacity = capacity;
		this.dimension = dimension;
	}

	public Float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public Byte getCapacity() {
		return capacity;
	}

	public void setCapacity(Byte capacity) {
		this.capacity = capacity;
	}

	public Object getDimensions() {
		return dimension;
	}

	public void setDimensions(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
}
