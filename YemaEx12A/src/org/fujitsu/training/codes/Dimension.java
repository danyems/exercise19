package org.fujitsu.training.codes;

public class Dimension {
	
	private Integer width;
	private Integer height;
	
	public Dimension() {
		this.setWidth(10);
		this.setHeight(20);
	}
	
	public Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
	
	

}
