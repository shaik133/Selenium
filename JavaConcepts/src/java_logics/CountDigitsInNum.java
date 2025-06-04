package java_logics;

public class CountDigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=12345123;
		int count=0;
		while(a!=0) {
			a=a/10;
			count++;
			
			
		}
		System.out.println(count);
	}

}
