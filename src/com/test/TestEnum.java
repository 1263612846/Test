package com.test;

public class TestEnum {
	private enum Color {
		red, blue, yellow
	};

	public static void main(String[] args) {
		System.out.println(Color.blue.toString());
		Color[] c = Color.values();
		for (Color cc : c)
			System.out.println(cc);
		System.out.println(Enum.valueOf(Color.class, "blue"));
		System.out.println(Color.blue.ordinal());
	}

}
