package com.test.interfaceAbout;

import javax.swing.SwingConstants;

public class Romo implements Student, SwingConstants {

	@Override
	public void sleep() {
		System.out.println("RomoË¯¾õ");
	}

	@Override
	public void study() {
		System.out.println("RomoÑ§Ï°");
		System.out.println(CENTER);
	}

}
