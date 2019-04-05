package com.yr.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		String[] s = new String[3];
		s[0] = "test";
		s[1] = "zoo";
		s[2] = "apple";
		Random r = new Random();
		
		for(int i=0; i<ar.length;i++) {
			ar[i]=r.nextInt(45)+1;
	
			System.out.println(ar[i]);
	
		}
		
		Arrays.sort(ar);
		Arrays.sort(s);
		System.out.println("----------");
		for(int i=0; i<ar.length; i++) {
	//		System.out.println(ar[i]);
			System.out.println(s[i]);
		}
		

	}

}
