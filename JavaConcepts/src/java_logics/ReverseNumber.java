package java_logics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int a=1234;
		
		int rev=0;
		
		while(a!=0) {
			int digit= a%10;
			rev=rev*10+digit;
			a=a/10;
		}
		System.out.println("reverse number of 1234 is "+rev);*/
		
		// 2nd approach by using the string buffer method
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=in.nextInt();
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer re=sb.reverse();
		System.out.println("reverse number of 1234 is "+re);
		*/
		
		
		// 3rd approach
		
		StringBuilder sb1= new StringBuilder();
		sb1.append(num);
		StringBuilder reverse=sb1.reverse();
		System.out.println(reverse);
	}
	
	

}
