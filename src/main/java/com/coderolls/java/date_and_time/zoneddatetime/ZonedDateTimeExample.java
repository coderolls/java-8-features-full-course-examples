package com.coderolls.java.date_and_time.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		
		ZonedDateTime zdt = ZonedDateTime.now(id);
		System.out.println("Current system default zoned date time: ");
		System.out.println(zdt);
		
		ZoneId id2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt2 = ZonedDateTime.now(id2);
		
		System.out.println("\nAmerica/Los_Angeles zoned date time: ");
		System.out.println(zdt2);

		
		

	}

}
