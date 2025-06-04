package java_logics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int count=0;
		
		if(a>1) {
			
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a+" is prime number");
			}
			else
			{
				System.out.println(a+" is not a prime number");
			}
		}
		else
		{
			System.out.println(a+" is not a prime number");
		}
		
		
	}

}
