package com.yr.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest6 {

	public static void main(String[] args) {
		
		Calendar calendar=Calendar.getInstance();
		//2019년 4월 8일 9시 13분
		
		String pattern = "yyyy년 MM월 dd일 HH:mm E";
		SimpleDateFormat sd=new SimpleDateFormat(pattern);
		//1
		Date date =calendar.getTime();
		String result = sd.format(date); 
		//2
		Date date2 = new Date();
		long now = calendar.getTimeInMillis();
		date2.setTime(now);
		String result2 = sd.format(date2);
		//3
		Date date3 = new Date(now);
		
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}

}
