package com.test;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hello World");
		s.substring(2);
		System.out.println(s);
		System.out.println(s.substring(2).toString());

	}

}
