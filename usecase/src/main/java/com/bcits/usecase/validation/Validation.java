package com.bcits.usecase.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static boolean isValidEmail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } // end of isValidEmail
	
	 public static boolean isValidNumber(String s) 
	    { 	        
	        Pattern p = Pattern.compile("[7-9][0-9]{9}"); 
	        Matcher m = p.matcher(s); 
	        return (m.find() && m.group().equals(s)); 
	    } // end of isValidNumber
	 
	  public static boolean empIdValid(int empId) {
		  String id = empId +"";
		  if(empId <= 0 ) { 
			  return true ;
		  } else if(id.length() != 6) {
			  return true;
		  } else { 
			  return false;
		  }
	  } // end of empIdValid
	  
	  public static boolean amountValid(double billAmount) {
		  if(billAmount <= 0) { 
			  return true ;
		  } else { 
			  return false;
		  }
	  } // end of amountValid
 
}
