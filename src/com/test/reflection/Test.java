package com.test.reflection;

public class Test {

	public static void main(String[] args) {

		Animal a = new Animal();
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());

		String str = "com.test.TestEnum";
		String str2 = "";
		try {
			System.out.println(Class.forName(str));
			System.out.println(Class.forName(str2));
		} catch (ClassNotFoundException e) {
			System.out.println("Œﬁ¥À¿‡");
		}

		String str3 = "com.test.reflection.Animal";
		try {
			System.out.println(Class.forName(str3).newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
