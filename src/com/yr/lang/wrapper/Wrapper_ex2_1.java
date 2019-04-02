package com.yr.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2_1 {

	public void ex1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String jumin = sc.next();
		int check =  Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		int sum=0;
		int count = 2;
		char ch =jumin.charAt(jumin.length()-1);
		for(int i=0; i<jumin.length()-1; i++) {
			char c = jumin.charAt(i);

			if(!Character.isDigit(c)) {
				continue;
			}

			String n = String.valueOf(c);
			int num = Integer.parseInt(n);
			sum=sum+sum*count;
			count++;
			if(count>9) {
				count=2;
			}
		}
		sum=sum%11;
		sum = 11-sum;
		
		if(sum>9) {
			sum=sum%10;
		}
		
		if(sum==check) {
			System.out.println("ok");
		} else System.out.println("no");
	}
}
