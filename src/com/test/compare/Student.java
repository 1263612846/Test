package com.test.compare;

public class Student implements Comparable<Student> {     // 泛型T为欲排序的对象所属的类（Student）

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(age, o.age);
	}

}
