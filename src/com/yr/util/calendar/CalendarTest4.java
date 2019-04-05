package com.yr.util.calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalendarTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar in = Calendar.getInstance(); //시작
		Calendar out = Calendar.getInstance();
		
		System.out.println("종료시간을 입력하세요");
		String time = sc.next();	//3-50 3시 50분
		String[] times = time.split("-");
		
		out.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
		out.set(Calendar.MINUTE, Integer.parseInt(times[1]));
		long inTime = in.getTimeInMillis();
		long outTime = out.getTimeInMillis();
		long result = outTime-inTime;
		
		
		long h = result/(1000*60*60);
		long m = result%(1000*60*60);
		
		if(m>0) {
			h++;
		}

		System.out.println("최종요금 : " + h*1000);
		
		
		
		
	//	System.out.println(cal.get(Calendar.HOUR));
		
		
		
		// 시간당 1000
		
		
	}
}
