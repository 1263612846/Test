package com.test.compare;

import java.util.Arrays;

public class TestPerson {

	public static void main(String[] args) {

		Person p1 = new Person(10);
		Person p2 = new Person(9);
		Person p3 = new Person(11);
		Person p4 = new Person(10);

		Person[] pp = { p1, p2, p3, p4 };
		Arrays.sort(pp);
		for (Person p : pp) {
			System.out.print(p.getAge() + " ");
		}

		if (p1 instanceof Comparable) {
			System.out.println("ÊôÓÚ");
		} else {
			System.out.println("²»ÊôÓÚ");
		}

	}

}
