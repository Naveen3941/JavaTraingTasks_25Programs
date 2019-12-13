package com.example;

public class Cargo {
	protected Float length;
	protected Float width;
	protected Float height;
	protected Double weight;
	public Cargo() {
		super();
	}
	public Cargo(Float length, Float width, Float height, Double weight) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
		@Override
		public String toString() {
			return String.format("%-15s %-15s %-15s %s" ,length.toString(),width.toString(),height.toString(),weight.toString());
		}
	
	
	
}
