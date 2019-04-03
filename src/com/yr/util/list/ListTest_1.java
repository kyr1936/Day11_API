package com.yr.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {
public static void main(String[] args) {
		ListTest_1 li = new ListTest_1();
		li.ex1();
}

	public void ex2() {
		//
		
		
		
		
	}



	public void ex1() {
		// 숫자를 입력 받아서 // 3
		// 해당 숫자만큼 랜덤한 숫자를 3개 생성해서
		// List 에 추가하고 출력
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		ArrayList ar= new ArrayList();
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			int num2 = rd.nextInt(100);
			ar.add(num2);
		} System.out.println(ar);
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}