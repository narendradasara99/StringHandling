package com;

public class StBuff {
	public static void main(String[] args) {		
		StringBuffer s=new StringBuffer("abc");
		s.append(" is  Sequence of characters ");
		System.out.println(s);

		s.insert( 2,"efghjklmnopqrstuvwxyz");
		System.out.println(s);


		s.replace(2, 6, " narendra is good boy");
		System.out.println(s);

		s.delete(2, 9);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
	}

}
