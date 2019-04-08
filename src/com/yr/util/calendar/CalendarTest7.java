package com.yr.util.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {
		
		String now = "2020-05-05";
		//문자열 -> Calendar
		//java.text.SimpleDateFormat
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(now);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		System.out.println(cal.get(Calendar.MONTH));
		
		
		
		
	}

}
