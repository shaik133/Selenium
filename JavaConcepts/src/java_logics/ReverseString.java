package java_logics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string; ");
		String inputString=sc.next();
		//String a= "Sadiq";
	// first approach using length and char at	
	/*	String rev="";
		int s=inputString.length();
		for (int i=s-1;i>=0;i--) {
			rev=rev+inputString.charAt(i);
		}
		System.out.println(rev);
		*/
		
		// 2nd approach by using stringBuffer
		
		/*
		 StringBuffer sb= new StringBuffer(inputString);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		*/
		
		//3rd Approach by using StringBuilder;
		StringBuilder sb1= new StringBuilder();
		sb1.append(inputString);
		String rev1 =sb1.reverse().toString();
		if(inputString.equalsIgnoreCase(rev1)) {
			System.out.println("The given string is palindrome");
		}else System.out.println("It is not polindrom");
	}

	
	
}
