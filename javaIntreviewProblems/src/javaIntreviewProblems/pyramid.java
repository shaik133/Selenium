package javaIntreviewProblems;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		*
		* *
		* * *
		* * * *
		
*/
		
//		for (int i=1; i<5;i++)
//		{
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print('*');
//				System.out.print('\t');
//			}
//			System.out.println();
//		}
		
		int a= 0;
		int b=1;
		int sum=0;
		int i=1;
		
		while(i<7)
		{
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
		}
		i++;
		
	}

}
