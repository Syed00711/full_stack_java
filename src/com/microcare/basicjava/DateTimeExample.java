package com.microcare.basicjava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
	
	
	LocalDate today =LocalDate.now();
	System.out.println(today.getYear());
	System.out.println(today.getMonthValue());
	System.out.println(today.isLeapYear());
	System.out.println(today.getDayOfMonth());
	System.out.println(today.getDayOfYear());
	System.out.println(today.getDayOfWeek());
	System.out.println(today.lengthOfYear());
	
	System.out.println(today.plusDays(5));
	System.out.println(today.plusWeeks(2));
	System.out.println(today.plusMonths(3));
	System.out.println(today.plusYears(5));
	
	System.out.println(today.minusDays(60));
	
	
	LocalDate future =LocalDate.of(2025, 02, 15);
	LocalDate past =LocalDate.of(2022, 05, 20);
	System.out.println(today.isAfter(future));
	System.out.println(future.isAfter(past));
	System.out.println(today.isEqual(past));
	
	String date="2021-05-10";
	
	LocalDate dateval=LocalDate.parse(date);

	
	System.out.println(past.getDayOfWeek());
	
	System.out.println("=====================LocalDateTime=============");
	
	LocalDateTime todaytime =LocalDateTime.now();
	System.out.println(todaytime);
	System.out.println(todaytime.now(ZoneId.of("America/Chicago")));
	System.out.println(todaytime.plusHours(24));
	System.out.println(todaytime.plusMinutes(1000));
	System.out.println(todaytime.plusSeconds(120));
	
	LocalDateTime futuretime =LocalDateTime.of(2024, 10, 25, 15, 30,55,345);
	System.out.println(futuretime);
	System.out.println("======================LocalTIme=================");
	LocalTime todaydate=LocalTime.now();
	System.out.println(todaydate);
	System.out.println(todaydate.plusHours(100));
	System.out.println(todaydate.minusMinutes(1000));
	 Date dateold =new Date();
	 
	 System.out.println(dateold);
	 System.out.println(Calendar.getInstance().getTime());
	}

}
