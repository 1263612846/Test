package com.test.clone;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p = new Person();
		p.setLight(10);
		System.out.println(p.getLight());

		Person pp = p.clone();
		System.out.println(pp.getLight());
		pp.grow(pp);
		System.out.println(pp.getLight());
		System.out.println(p.getLight());

		// 数组的克隆
		int[] i = { 1, 2, 3, 4, 5 };
		int[] ii = i.clone();
		ii[1] = 3;
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(ii));

	}

}
