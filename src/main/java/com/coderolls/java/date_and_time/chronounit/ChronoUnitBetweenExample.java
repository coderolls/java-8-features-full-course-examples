package com.coderolls.java.date_and_time.chronounit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitBetweenExample {

	public static void main(String[] args) {
		
		LocalDateTime lt = LocalDateTime.of(2014, 5, 16, 15, 30);
		
		LocalDateTime lt2 = LocalDateTime.now();
		
		long years = ChronoUnit.YEARS.between(lt, lt2);
		
		System.out.println("years: "+ years);
		
		long months = ChronoUnit.MONTHS.between(lt, lt2);
		
		System.out.println("months: "+ months);
		
		long weeks = ChronoUnit.WEEKS.between(lt, lt2);
		
		System.out.println("weeks: "+ weeks);
		
		long days = ChronoUnit.DAYS.between(lt, lt2);
		
		System.out.println("days: "+ days);
		
		long hours = ChronoUnit.HOURS.between(lt, lt2);
		
		System.out.println("hours: "+ hours);
		
		long minutes = ChronoUnit.MINUTES.between(lt, lt2);
		
		System.out.println("minutes: "+ minutes);
		
		long seconds = ChronoUnit.SECONDS.between(lt, lt2);
		
		System.out.println("seconds: "+ seconds);
		
		long millies = ChronoUnit.MILLIS.between(lt, lt2);
		
		System.out.println("millies: "+ millies);
		
		long nanos = ChronoUnit.NANOS.between(lt, lt2);
		
		System.out.println("nanos: "+ nanos);

	}

}
