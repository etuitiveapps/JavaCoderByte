package com.etuitiveapps.javacoderbyte;

public class FirstReverseClass {
/**
 * Using the Java language, have the function FirstReverse(str)
 *  take the str parameter being passed and return the string in reversed order.
 *  Use the Parameter Testing feature in the box below to test your code with different arguments.
 * @param str is the user input.
 * @return Reverse of the user input.
 */
  public String firstReverse(String str) {
    StringBuilder sb = new StringBuilder();
    char[] charArray = str.toCharArray();
    int startIndex = str.length() - 1;
    for (int i = startIndex; i >= 0; i--) {
      sb.append(charArray[i]);
    }
    return sb.toString(); 
  }
}
