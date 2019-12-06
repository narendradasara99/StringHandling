package com;

public class StBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer();
	s.append("dhhdh");
	System.out.println(s);
		System.out.println(s.capacity());//16
		StringBuffer s2=new StringBuffer("abc");
		System.out.println(s2.capacity());//19
		StringBuffer s3=new StringBuffer(3);
		System.out.println(s3.capacity());//3
		
		
		//append
		



	}

}
