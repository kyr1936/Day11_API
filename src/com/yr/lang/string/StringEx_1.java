package com.yr.lang.string;

import java.util.Scanner;

public class StringEx_1 {

	// ex1
	// 주민등록번호 입력 991224-1234567
	// 남자 / 여자

	public void ex1() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String s = sc.next(); //931112-1234576

		String result=null;
		char c = s.charAt(7);


		if(c=='1'||c=='3'||c=='5') {
			System.out.println("남자");
		} else if(c=='2'||c=='4') {
			System.out.println("여자");
		}
	}


	public void ex2() {
		String name = "Mississippi";
		// i 글자가 몇 개 있습니까?
		int i=-1;
		int count = 0;

		while(true) {
			i = name.indexOf("i",i+1);
			if(i!=-1) {
				count++;
			} else break;

		} System.out.println(count);
	}
	public void ex3() {
		// 문자열 입력받고
		// 한 글자 당 100원, 총 가격은?
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String s = sc.next();

		int price=0;

		price = 100*s.length();
		System.out.println("총 가격은 : " + price);
	}

	public void ex4() {
		//id입력 - 이메일 형식 @. 최대 10글자 이하로만
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세4요");
		String id = sc.next();

		if(id.length()>10) {
			System.out.println("최대 글자수 초과");
		} else if (id.indexOf("@")!=-1) {
			System.out.println(id);
		} else System.out.println("이메일 형식이 아닙니다");

		 */
		Scanner sc = new Scanner(System.in);
		boolean check1 = false;
		boolean check2 = false;
		System.out.println("id를 입력하세요");
		String id = sc.next();

		if(id.length()<11) {
			check1=true;
		}
		int index = id.indexOf("@");
		if(index !=-1) {
			check2 = true;
		}
		if(check1 && check2) {
			System.out.println("사용가능한 id : "+ id);
		} else System.out.println("사용 불가한 id");	
	}

	public void ex5() {
		//jpg, png, gif
		//업로드 할 파일명 입력
		//이 파일이 이미지 파일인지 아닌지 구분
		//이미지가 아니라면 메세지 <이미지만 업로드 가능 >
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드 할 파일명 입력");
		String uproad = sc.next();
		int i = uproad.lastIndexOf(".");

		if(uproad.substring(i).equals(".jpg")||
			uproad.substring(i).equals(".png")||
			uproad.substring(i).equals(".gif")) {
			System.out.println("업로드 가능");
		} else System.out.println("이미지만 업로드하세요");


	}

	
	
	
	
	








}
