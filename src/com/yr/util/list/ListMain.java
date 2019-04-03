package com.yr.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList(); // 배열 크기를 선언할 필요 x
		//1, 2, 3, 4
		Object e = ""; // 다형성
		ar.add("1"); 
		ar.add(2); //primitive type이지만 int->Integer로 변경되서 삽입 : autoBoxing (클래스의 부모는 Object)
		ar.add(3.12);
		ar.add('a');
		
		String s = (String)ar.get(0); //받아오는 요소의 타입은 Object 이기 때문
		int num = (int)ar.get(1); // Integer-> int 로 autoUnBoxing 
		
		// ar.add(1, 2000);
		System.out.println(ar);
		
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		//ar.clear();
		ar.remove(2);
		
		System.out.println(ar);
		
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		// Integer타입만 담아라
		
		ar2.add(1);
		//ar2.add("2"); //Integer타입이 아님
		int n1 = ar2.get(0);
		
		
		
		//  generic : 정한 타입만 가능
		
		
		
		
		

	}

}
