package com;
import java.util.Arrays;
import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer(" i am naren","am");
		System.out.println(s.countTokens());
		while(s.hasMoreElements()) {
			System.out.println(s.nextToken());
		}
		String s1= new String(" i am naren");
		String []a=s1.split("am");
		System.out.println(a.length);
		for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
