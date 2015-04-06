package com.etuitiveapps.javacoderbyte;

public class FirstReverseClass {
	
	public String FirstReverse(String str) { 
		 StringBuilder sb = new StringBuilder();
	        char[] charArray = str.toCharArray();
	        int startIndex = str.length() - 1;
	        for (int i = startIndex; i >= 0; i--) {
	            sb.append(charArray[i]);
	        }
	        return sb.toString();
	    
	  } 

}
