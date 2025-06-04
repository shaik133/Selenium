package javaIntreviewProblems;

public class Q3 {
 //--- max diffrence between adjacent index in array---

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {3,5,7,10};  // which 5-3=2 , 7-5=2, and 10-7=3  and find the max value. which is 3
		int diff=0;
		for (int i=0; i<a.length-1;i++)	
		{
			
		if(a[i+1] - a[i]>diff)
			{
			diff= a[i+1]-a[i];
			}
		}
		System.out.println(diff);
	}

}
