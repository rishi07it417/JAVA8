package com.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;


public class TestDates {

	public static void main(String args[]){
		LocalDate d =LocalDate.now();
		System.out.println("::Date:::"+d);
		
		LocalDate dt = LocalDate.of(2020, 10, 29);
		System.out.println("::Date:::"+dt);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("::DateFortmat:::"+f.format(dt));
		
		System.out.println("::period:::"+ Period.between(d, dt).getDays());
		
		LocalTime t = LocalTime.now();
		LocalTime t2 = t.plusHours(5).plusMinutes(11);
		System.out.println("::duration:::"+ Duration.between(t, t2).toHours());

		LocalDate jn = LocalDate.of(2020, 06, 1);
		TemporalAdjuster t1 = TemporalAdjusters.next(jn.getDayOfWeek().SATURDAY);
		jn = jn.with(t1);
		System.out.println("First Sat of Jun 2020:"+jn);
		
		jn = jn.with(TemporalAdjusters.next(jn.getDayOfWeek().SATURDAY));
		System.out.println("Second Sat of Jun 2020:"+jn);



	}
}
