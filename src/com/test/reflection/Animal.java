package com.test.reflection;

public class Animal {

	private double light;
	private double wight;

	public double getLight() {
		return light;
	}

	public void setLight(double light) {
		this.light = light;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	@Override
	public String toString() {
		return "Animal [light=" + light + ", wight=" + wight + "]";
	}

}
