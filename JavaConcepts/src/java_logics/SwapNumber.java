package java_logics;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// swaping 2 integeres using temperory variable
		
		int a= 3;
		int b= 6;
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of integer post swapping a="+a+" b="+b);
		
		
		//swaping of numbers without temperory variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of integer post swapping a="+a+" b="+b);
	}

}
