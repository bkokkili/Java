package com.corejava.subpackage;

public class PalindromeString {
	public static void main(String[] args) {
          String str = "Madam";
          String revString = "";
          
          for(int i=(str.length() - 1); i >= 0; i--) {
        	  revString = revString + str.charAt(i);
          }
          
          if(str.equalsIgnoreCase(revString)) {
        	  System.out.println("String is Palindrome");
          }else {
        	  System.out.println("String is not Palindrome");
          }
	}
}
