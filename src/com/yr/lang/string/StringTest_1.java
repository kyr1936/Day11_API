package com.yr.lang.string;

public class StringTest_1 {

	public static void main(String[] args) {

/*		System.out.println(String.CASE_INSENSITIVE_ORDER);
		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		String str = "abcdefg";
		char c1 =str.charAt(5);
		System.out.println(c1);
		
		StringEx_1 ex = new StringEx_1();
		ex.ex1();    */
		
		String str= "hellow world";
		int i = str.indexOf("he", 5);
		System.out.println(i);
		
		String r = str.substring(7);
		System.out.println(r);
		r = str.substring(2, 3);
		System.out.println(r);
		
		r = str.toUpperCase();
		System.out.println(r);
		r=str.toLowerCase();
		System.out.println(r);
		
		
		StringEx_1 ex = new StringEx_1();
		ex.ex2();
		
		str = "choa";
		int l = str.length();   //isEmpty
		System.out.println(l);
		
		String str1="test";
		String str2=" test ";
		
		r=str2.trim();
		System.out.println(str2);
		System.out.println(r);
		
		r=String.valueOf(3);
		System.out.println(r);
		
		String ss="iu-choa-suji-hani";
		String [] names = ss.split("-");
		for(i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		ss="a,b,c-d-e-f";
		r= ss.replace('-', ',');
		System.out.println(r);
		
		int a=10;
		
		
	}

}
