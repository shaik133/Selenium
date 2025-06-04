package java_logics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234;
		int sum=0;
		while(a!=0) {
			int digit=a%10;
			a=a/10;
			sum=sum+digit;
		}
		System.out.println(sum);
		
		int x=10;
		int y=60;
		int z=30;
		
		if(x>y & x>z) {
			System.out.println(x +" is largest num");
		}
		 else if (y>x & y>z) {
			 System.out.println(y +" is largest num");
		}
		 else if(z>x & z>y) {
			 System.out.println(z +" is largest num");
		 }
	}

}
