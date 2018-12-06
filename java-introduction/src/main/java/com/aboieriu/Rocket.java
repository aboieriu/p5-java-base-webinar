package com.aboieriu;

/**
 * @author aboieriu
 */
public class Rocket {
	private float width;
	private float height;
	private String color;

	public Rocket(float inputWidth, float inputHeight, String inputColor){
		this.width = inputWidth;
		this.height = inputHeight;
		this.color = inputColor;
	}

	public float sumWidthAndHeight(){
		return this.width + this.height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
