package com.coderolls.java.date_and_time.duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		
		LocalTime lt = LocalTime.now();
		
		LocalTime lt2 = LocalTime.of(20, 30);
		
		Duration d = Duration.between(lt, lt2);
		
		System.out.println("Complete Duration between lt and lt2 in Hours: "+ d.toHours());
		
		System.out.println("Complete Duration between lt and lt2 in Minutes: "+ d.toMinutes());

		System.out.println("Complete Duration between lt and lt2 in Seconds: "+ d.getSeconds());
		
		Duration d2 = Duration.of(1, ChronoUnit.HOURS);
		
		System.out.println("\nComplete Duration d2 in Minutes: "+ d2.toMinutes());

		
		Duration d3 = Duration.ofHours(1);
		
		System.out.println("Complete Duration d3 in Minutes: "+ d3.toMinutes());

	}

}
