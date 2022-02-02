package com.coderolls.java.date_and_time.localedatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		// date
		
		int day = dateTime.getDayOfMonth();
		int month = dateTime.getMonthValue();
		int year = dateTime.getYear();
		
		System.out.println("day: "+ day+ ", month:  "+ month+ ", year: "+ year);
		
		// time
		
		int hour = dateTime.getHour();
		
		int min = dateTime.getMinute();
		
		int sec = dateTime.getSecond();
		
		int nano = dateTime.getNano();
		
		System.out.println("hour: "+ hour+ ", min: "+ min+", sec: "+ sec+ ", nano "+nano);
	}

}
