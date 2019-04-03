package com.yr.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {
		// 1. 정보입력 
		//		이름 입력
		//		나이 입력
		// 2. 정보출력 - 모든 정보 출력  
		// 3. 종료
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> ar = new ArrayList<>();
		ListExInput li = new ListExInput();
		ListExView lv = new ListExView();
		while(true) {
			System.out.println("1.정보 입력   2. 정보 출력  3. 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				
				Member m = li.setInfo();
				ar.add(m);
				
			}else if (select==2) { 
				lv.view(ar);
			} else {
				System.out.println("종료");		
				break;
			}
		}


	}

}
