package com.coderolls.java.date_and_time.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println();
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dtFormatted = formatter.format(dt);
		System.out.println(dtFormatted);
		

	}

}
