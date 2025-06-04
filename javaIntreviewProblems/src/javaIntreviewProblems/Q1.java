package javaIntreviewProblems;

public class Q1 {

// -----create one method which accepts array and returns sum of all the elements in array-------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,4,5,6};
		
		int sum =sumArray(a);
		System.out.println(sum);
	}

	//creating method
	
	public static int sumArray(int [] a)
	{
		int avg=0;
		int sum=0;
		for (int i =0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		
		avg= sum/a.length;
		return avg;
	}
	
}
