package com.coderolls.java.date_and_time.localdatetime;

import java.time.LocalDateTime;

public class ParticularDateExample {

	public static void main(String[] args) {
		
		
		// 20th may 2000, 10:20:46
		
		LocalDateTime dt = LocalDateTime.of(2000, 5, 20, 10, 20, 46);
		System.out.println("20th may 2000, 10:20:46: "+ dt);
		
		// current
		LocalDateTime dt2 = LocalDateTime.now();
		System.out.println("\nCurrent Date time: "+ dt2);

		// after 3 months
		LocalDateTime after3Months = dt2.plusMonths(3);
		System.out.println("\nafter3Months: "+ after3Months);
		
		// before 2 months
		
		LocalDateTime before2Months = dt2.minusMonths(2);
		System.out.println("\nbefore2Months: "+ before2Months);


	}

}
