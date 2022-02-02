package com.coderolls.java.date_and_time.localdate;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		int day = date.getDayOfMonth();
		
		int month = date.getMonthValue();
		
		int year = date.getYear();
		
		System.out.println("day: "+ day+", month: "+ month+", year: "+ year);

	}

}
