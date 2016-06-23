package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>(1);
		a.add(1);
		a.add(2);
		System.out.println(a);
		System.out.println(a.size());
		a.trimToSize();
		a.add(3);
		System.out.println(a);

		System.out.println(a.get(1));
		a.add(0, 0);
		System.out.println(a.get(1));
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		// a.set(4, 4); // error:setֻ���滻�������Ѿ����ڵ�Ԫ������

		ArrayList<Integer> a2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a2.add(i);
		}
		System.out.println(a2);
		System.out.println(a2.size());
		Integer[] a3 = new Integer[a2.size()];
		a2.toArray(a3);
		System.out.println(Arrays.toString(a3));

		// ��������Բ���
		int a11 = 10;
		int b11 = 10;
		if (a11 == b11)
			System.out.println("1");
		else
			System.out.println("2");

		Integer a111 = 1000;
		Integer a222 = 1000;
		if (a111 == a222)
			System.out.println("11");
		else
			System.out.println("22"); // �Զ�װ��Ҫ�� -127 < i <127 ����a111��a222�ĳ�10����� 11
		if (a111.equals(a222))
			System.out.println("111");
		else
			System.out.println("222");
		
	}

}
