package com.test.clone;

public class Person implements Cloneable {

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

	public Person grow(Person p) {
		p.light += 10;
		return p;
	}

	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}
