package com.test.object;

import java.util.Arrays;
import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		
		// equals()
		Person p = new Person();
		p.setName("Mike");
		p.setAge(20);

		Student s = new Student();
		s.setName("Mike");
		s.setAge(20);
		
		System.out.println(s.getClass());

		if (p.equals(s)) {
			System.out.println("相等");
		} else {
			System.out.println("不等");
		}
		
		// hashCode()
		String str = "Hello";
		String str1 = "Hello World";
		String str2 = str + str1;
		System.out.println(Objects.hash(str,str1));
		System.out.println(Objects.hashCode(str2));
		
		// toString()
		int i = 10;
		String j = i + "";
		System.out.println(j);
		
		int[] i1 = { 1, 2, 3 };
		System.out.println(i1);
		System.out.println(i1.toString());
		System.out.println(Arrays.toString(i1));

	}

}
