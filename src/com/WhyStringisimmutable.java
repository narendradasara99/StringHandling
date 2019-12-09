package com;

import java.util.HashMap;
import java.util.Map;

public class WhyStringisimmutable {

	public static void main(String[] args) {

		Map m=new HashMap<>();
		String s= new String("naren");
		m.put(s,8);
		s.toUpperCase();
		System.out.println(m.get("naren"));
		
		StringBuffer s1=new StringBuffer("d");
		m.put(s1,10);
		s1.append("narendra");
		System.out.println(m.get("d"));
		
	}

}
