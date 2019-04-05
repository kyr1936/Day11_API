package com.yr.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortTest_3 {

	public static void main(String[] args) {
		/*
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar2 = new ArrayList<String>();
	
		ArrayList<ArrayList<String>> ar3 = new ArrayList<ArrayList<String>>();
		ar3.add(ar2);
		ar3.add(ar);
		
		HashMap<ArrayList<String>, ArrayList<String>> map 
					= new HashMap<ArrayList<String>, ArrayList<String>>();
		map.put(ar, ar2);
		*/
		/* 
		Member m1 =new Member("iu", 26);
		Member m2 = new Member("choa", 32);
		Member m3 = new Member("hani", 16);
		Member m4 = new Member("suji", 26);
		ArrayList<Member> ar = new ArrayList<Member>();
		ar.add(m1);
		ar.add(m2);
		ar.add(m3);
		ar.add(m4);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 나이순    2. 이름순");
		int select = sc.nextInt();
		
		if(select==1) {
			
		}
		
		Collections.sort(ar);
		
		for(int i=0; i<ar.size();i++) {
			System.out.println("id : " + ar.get(i).getId());
			System.out.println("age : "+ar.get(i).getAge());
			System.out.println("----------------");
		}
		*/
		
		Member member = new Member("choa", 20);
		System.out.println("객체주소 : " + member);
		Member member2 = new Member("choa", 20);
		System.out.println(member==member2);
		System.out.println(member.equals(member2));
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
		
		//
		
	}
		
		public static void sort(List<Comparable<Object>> ar) {
			int result=0;
			int num =ar.get(0).compareTo(ar.get(1));
			if(num>0) {
				 result=-1;
			} else if(num<0) {
				result=1;
			} else result=0;
		}
}
