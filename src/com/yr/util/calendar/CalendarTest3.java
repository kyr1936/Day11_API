package com.yr.util.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		/*
		cal2.set(Calendar.MINUTE, 40);
		cal2.add(Calendar.DATE, 2);
		
		long l = cal.getTimeInMillis();
		long l2 = cal2.getTimeInMillis();
		long l3 = l2-l;
		System.out.println(l3/(1000*60*60*24));
		*/
		cal2.set(1993, 11, 12);
		
		long l = cal.getTimeInMillis();
		long l2 = cal2.getTimeInMillis();
		long l3 = l-l2;
		System.out.println(l3/(1000*60*60*24));
		
	}
}
