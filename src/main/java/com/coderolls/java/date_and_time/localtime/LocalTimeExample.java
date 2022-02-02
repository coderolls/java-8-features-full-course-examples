package com.coderolls.java.date_and_time.localtime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		
		int m = time.getMinute();
		
		int s = time.getSecond();
		
		int n = time.getNano();
		
		System.out.println("h: "+ h + ", m: "+ m + ", s: "+ s+ ", n: "+ n);
		

	}

}
