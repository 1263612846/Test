package com.test.interfaceAbout;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Student s1 = new Romo();
		s1.sleep();
		s1.study();

		Student s2 = new Romoon();
		s2.sleep();
		s2.study();

		Person s3 = new Romo();

		if (s1 instanceof Person || s2 instanceof Student)
			System.out.println("ÊôÓÚ");
		else
			System.out.println("²»ÊôÓÚ");

		System.out.println(s3.TYPE);
		System.out.println(s2.TYPE);

	}

}
