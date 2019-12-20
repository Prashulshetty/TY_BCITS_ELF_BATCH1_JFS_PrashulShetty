package com.exception.customizeexception;

public class CustomizeException { 
	  public static void check(int age)throws InvalidAgeException {  
	     if(age<18) { 
	      throw new InvalidAgeException("not valid age");  
	     } else { 
	      System.out.println("welcome to vote");  
	     }
	   }  
	     
	   public static void main(String[]  args) {  
	      try {  
	      check(13);  
	      } catch(Exception m) {
	    	  System.out.println("Exception occured "); 
	      } 
	  }  
	} 