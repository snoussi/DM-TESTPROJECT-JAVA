package com.total.anac.model;

public class SampleBuisness {

	public SampleBuisness() {
		super();
	}

	public void doNothing() {
		System.out.println("doNothing method called");
	}

	public double getTemperature(Sample sample) {
		return sample.getTemperature();
	}

	public void getTemperatureFromSample(Sample sample) {
		System.out.println("Temperature from sample" + sample.getTemperature());
	}

}
