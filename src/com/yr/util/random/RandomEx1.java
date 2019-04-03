package com.yr.util.random;

import java.util.Random;

public class RandomEx1 {

	public void ex4() {
		//rpg
		//0->1
		//10% 확률로 2단계 성공
		//20% 확률로 1단계 성공
		//70% 확률로 실패
		Random rd = new Random();
		int level = 0;
		double per=0.0;
		per = rd.nextDouble();

		if(per>=0.1 && per<0.2) {
			System.out.println("1단계 성공");
			level ++;
		} else if(per<=0.1) {
			System.out.println("2단계 성공");
			level +=2;
		} else System.out.println("실패");

		System.out.println("현재 level : " + level);
	}

	public void ex2() {
		Random random = new Random();
		int [] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				// 비교 - 중복방지
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
	
		for(int i=0; i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
		//출력
	}


	public void ex3() {
		
		String[] foods = {"떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기" };
		Random rd = new Random();

		int index = rd.nextInt(foods.length);

		System.out.println(foods[index]);

	}
	// 6개 숫자 출력
	// 1~45번 출력
	public void ex1() {
		Random rd = new Random();
		int num;
		for(int i=0; i<6; i++) {
			num=rd.nextInt(45);
			System.out.println(num+1);
		}
	}
	public static void main(String[] args) {

		new RandomEx1().ex2();
	}



}
