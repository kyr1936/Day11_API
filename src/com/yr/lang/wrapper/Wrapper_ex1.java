package com.yr.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex1() {
		// 주민번호 입력
		// 1. 나이 
		// 2. 3~5월 : 봄, 6~8 : 여름, 9~11 : 가을, 12~2 : 겨울
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String jumin = sc.next();  //931112-2345678
		
		String year = jumin.substring(0,2);
		int y = Integer.parseInt(year);
		int age =0;
		String s = jumin.substring(7,8);
		int i = Integer.parseInt(s);
		
		if(i==1 || i==2) {
			age = 2019-(1900+y)+1;
			System.out.println("나이 : " +age);
		} else if(i==3 || i==4) {
			age = 2019-(2000+y)+1;
			System.out.println("나이 : " + age);
		}

		String month = jumin.substring(2,4);
		int m = Integer.parseInt(month);

		if(m>=3 && m<=5) {
			System.out.println("봄");
		} else if (m>=6 && m<=8) {
			System.out.println("여름");
		} else if (m>=9 && m<=11 ) {
			System.out.println("가을");
		} else if (m>=12 && m<=2) {
			System.out.println("겨울");
		}
		

	}
}
