package com.test.compare;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("张三", 20);
		Student s2 = new Student("李四", 18);
		Student s3 = new Student("王五", 22);
		Student s4 = new Student("赵六", 19);
		Student s5 = new Student("孙七", 21);

		Student[] s = { s1, s2, s3, s4, s5 };

		Arrays.sort(s);
		for (Student ss : s)
			System.out.println(ss);

	}

}
