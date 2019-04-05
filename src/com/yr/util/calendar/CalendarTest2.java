package com.yr.util.calendar;

import java.util.Calendar;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class CalendarTest2 {

	public static void main(String[] args) {
		
	Calendar cal = Calendar.getInstance();
	// 생일을 세팅
	// 무슨요일인가
//	cal.set(1993, 10, 12);
//	System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 일요일부터 1

//	cal.set(Calendar.DATE, Calendar.DATE+3);
//	System.out.println(cal.get(Calendar.DATE));
	
	/*
	System.out.println("Month : " + cal.get(Calendar.MONTH));
	cal.roll(Calendar.DATE, 28);
	System.out.println("Month : " + cal.get(Calendar.MONTH));
	System.out.println(cal.get(Calendar.DATE));
	*/
	
	System.out.println("Month : " + cal.get(Calendar.MONTH));
	cal.add(Calendar.DATE, 28);
	System.out.println("Month : " + cal.get(Calendar.MONTH));
	System.out.println(cal.get(Calendar.DATE));
	
	
	
	
	
	}
	
}
