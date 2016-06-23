package com.test;

public class TestEquals {

	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");

		if (s1 == s2) {
			System.out.println(111);
		} else {
			System.out.println(222);
		}

		if (s1.equals(s2)) {
			System.out.println(333);
		} else {
			System.out.println(444);
		}

	}

}
