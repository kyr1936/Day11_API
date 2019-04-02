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
		System.out.println(month);

		if(m>=3 && m<=5) {
			System.out.println("봄");
		} else if (m>=6 && m<=8) {
			System.out.println("여름");
		} else if (m>=9 && m<=11 ) {
			System.out.println("가을");
		} else if (m>=2 && m<=12) {
			System.out.println("겨울");
		}
	}

	public void ex2() {
		// 비밀번호 입력
		// 대문자 1개 이상, 소문자 1개 이상, 공백 x
		// 숫자 1개 이상으로 조합
		// 최소 6자 이상
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine(); // 공백까지 포함해라
		int count =0; //문자열의 개수
		int upper=0;
		int lower=0;
		int digit=0;
		int space=0;
		count = pw.length(); 

		if (count>=6) {
			for(int i=0; i<pw.length(); i++) {
				char ch = pw.charAt(i);
				if(Character.isUpperCase(ch)==true) {
					upper++;
				} else if(Character.isLowerCase(ch)==true) {
					lower++;
				} else if(Character.isDigit(ch)==true) {
					digit++;
				} else if (Character.isWhitespace(ch)==true) {
					space ++;
				}

			} 
			System.out.println(upper);
			System.out.println(lower);
			System.out.println(digit);
			System.out.println(space);
			

			if(upper==0 || lower==0 || digit==0 || space>=1) {
				System.out.println("비밀번호 설정 불가");
			} else System.out.println("비밀번호 설정 : " + pw);

		} else System.out.println("6자리 이상을 입력하세요");



	}




}
