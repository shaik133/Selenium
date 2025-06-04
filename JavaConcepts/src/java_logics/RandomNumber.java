package java_logics;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String num="ABCDEFGHIabcdefghi123456790";
		String randomC="";
		StringBuilder sb= new StringBuilder();
		Random random =new Random();
		int length=5;
		for(int i=0;i<length;i++) {
			int index=random.nextInt(num.length());
			char randomChar=num.charAt(index);
			 randomC=sb.append(randomChar).toString();
		}
		System.out.println(randomC);
	}

}
