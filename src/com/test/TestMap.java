package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, Object> m = new HashMap<>();
		m.put("name", "gao");
		m.put("age", 20);
		System.out.println(m.toString());

	}

}
