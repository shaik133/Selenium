package java_logics;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {45,56,80,66,31};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum number in given array is "+max);
		System.out.println("Minimum number in given array is "+min);
	}

}
