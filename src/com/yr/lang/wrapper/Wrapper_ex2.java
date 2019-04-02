package com.yr.lang.wrapper;


import java.util.Scanner;

public class Wrapper_ex2 {
	// 주민번호 입력 941226-1234567
	// 마지막 번호는 체크용 번호로 따로 저장
	//   9 4 1 2 2 6 - 1 2 3 4 5 6 7
	// * 2 3 4 5 6 7   8 9 2 3 4 5
	// -----------------------------
	//  18+12+...+
	// 결과를 11로 나눈 나머지  구하기
	// 나머지를 11로 뺀 값을 체크용 번호랑 비교
	// 같으면 ok
	// 위의 결과값이 2자리라면 위의 결과값을 10으로 나눈 나머지를 체크번호와 비교

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String jumin = sc.next();
		int sum = 0;
		int n=2;
		int last = Integer.parseInt(jumin.substring(jumin.length()-1)); // 마지막 번호 저장
		System.out.println("last : " + last);

		
		for(int i=0; i<jumin.length()-1; i++) {
			if(i==6) i++;
			if(i==9) n=2;
			sum= sum+Integer.parseInt(jumin.substring(i,i+1))*n;
				n++;
		}
		System.out.println(sum);

		int result = sum%11;
		
		System.out.println(result);//6
		result = 11-result;//5
		
		System.out.println("11뺀거 : " + result);
		if(result==10 || result==11) 
			result= result%10;
		
		if(result==last) {
			System.out.println("주민번호 적합");
		} else System.out.println("부적합");
		
	}
	
	
	 
	 
	
	
	
}
