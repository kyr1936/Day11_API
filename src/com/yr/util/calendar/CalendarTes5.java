package com.yr.util.calendar;

import java.util.Calendar;

public class CalendarTes5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3, 1);
		int max = ca.getActualMaximum(Calendar.DATE);
		System.out.println(max);  // 해당 월의 마지막 일

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println();
		int week = ca.get(Calendar.DAY_OF_WEEK)-1;
		for(int i=0; i<week; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=max; i++) {

			System.out.print(i+"\t");
			/*
			ca.set(Calendar.DATE,i);
			if(ca.get(Calendar.DAY_OF_WEEK)%7==0) {
			*/	
			if((week+i)%7==0) {
				
			
			System.out.println();
			}
	
		}
		System.out.println();
		System.out.println("year: " + Calendar.YEAR);
		System.out.println("month : " + Calendar.MONTH);
		System.out.println("date : " + Calendar.DATE);
		
	}
}
