package javaIntreviewProblems;

public class Q2v1 {
	// printing the 5 multiplication without using the mmultiply operator 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = multiply(5,10);
		System.out.println(sum);
	}

	public static int multiply(int i, int j)
	{
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum= sum+i;
		}
		return sum;
	}
	
}
