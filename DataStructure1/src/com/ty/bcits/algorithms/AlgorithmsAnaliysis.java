package com.ty.bcits.algorithms;

import java.time.Duration;
import java.time.Instant;

public class AlgorithmsAnaliysis {
	public static Long addupto(long number) {
		long total=0L;
		for (long i = 0L; i <= number; i++) {
			total=total+i;
		}
		return total;
	}

	public static Long adduptoQuick(long number) {
		
		return number * (number+1)/2;
	}
	public static void adduptoduration() {
		Long number = 999999999L;
		Instant s = Instant.now();
		System.out.println(addupto(number));
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println("addupto took " +seconds +" seconds");
	}
	public static void adduptoquickduration() {
		Long number = 999999999L;
		Instant s = Instant.now();
		System.out.println(adduptoQuick(number));
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println("adduptoquick took " +seconds +" seconds");
	}
	public static void main(String[] args) {
		adduptoduration();
		adduptoquickduration() ;
		
	}
	
}
