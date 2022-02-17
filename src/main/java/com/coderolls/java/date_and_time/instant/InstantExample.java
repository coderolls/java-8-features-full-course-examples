package com.coderolls.java.date_and_time.instant;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		
		Instant it = Instant.now();
		
		System.out.println("Current systen instant timestamp:");
		System.out.println(it);
		
		System.out.println("\nTime in epoch seconds:");
		long epochSeconds = it.getEpochSecond();
		System.out.println(epochSeconds);
		
		System.out.println("\nTime in epoch millies:");
		long epochMillies = it.toEpochMilli();
		System.out.println(epochMillies);
		
		System.out.println("\nCurrent system instant timestamp plus 50 seconds:");
		System.out.println(it.plus(Duration.ofSeconds(50)));
		
		System.out.println("\nCurrent system instant timestamp minus 3 minutes:");
		System.out.println(it.minus(Duration.ofMinutes(3)));

	}

}
