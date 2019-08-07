package com.total.anac.model;

public class Sample {

	
	private String color;
	private double temperature;
	private int measUp;
	private int compUp;

	public Sample(String color, double temperature, int measUp, int compUp) {
		super();
		this.color = color;
		this.temperature = temperature;
		this.measUp = measUp;
		this.compUp = compUp;
	}

	public int getMeasUp() {
		return measUp;
	}

	public void setMeasUp(int measUp) {
		this.measUp = measUp;
	}

	public int getCompUp() {
		return compUp;
	}

	public void setCompUp(int compUp) {
		this.compUp = compUp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void addComment(int code) {
		System.out.println("the rule number " + code + " has been executed ");
	}

	
	@Override
	public String toString() {
		return "Sample [color=" + color + ", temperature=" + temperature + ", measUp=" + measUp + ", compUp=" + compUp
				+ "]";
	}

}
