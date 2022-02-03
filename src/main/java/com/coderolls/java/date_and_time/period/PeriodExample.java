package com.coderolls.java.date_and_time.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		
		// age cal
		
		LocalDate dt = LocalDate.of(2000, 1, 1);
		
		LocalDate dt2 = LocalDate.now();
		
		Period p = Period.between(dt, dt2);
		
		System.out.println("Years: "+ p.getYears());
		System.out.println("Months: "+ p.getMonths());
		System.out.println("Days: "+ p.getDays());


	}

}
