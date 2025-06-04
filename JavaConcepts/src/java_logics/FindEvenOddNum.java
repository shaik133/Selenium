package java_logics;

public class FindEvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=12;
		
		int evenCount=0;
		int oddCount=0;
		while(a!=0) {
			int digit=a%10;
			a=a/10;
			if(digit%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Count of even digits are "+evenCount);
		System.out.println("Count of odd digits are "+oddCount);
	}

}
