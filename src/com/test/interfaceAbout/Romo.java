package com.test.interfaceAbout;

import javax.swing.SwingConstants;

public class Romo implements Student, SwingConstants {

	@Override
	public void sleep() {
		System.out.println("Romo˯��");
	}

	@Override
	public void study() {
		System.out.println("Romoѧϰ");
		System.out.println(CENTER);
	}

}
