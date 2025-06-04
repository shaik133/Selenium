package java_logics;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1 using Arrays class
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		/*	boolean status=Arrays.equals(a, b);
		if(status==true){
			System.out.println("Arrays are eqaul");
		}
		else System.out.println("Arrays are not equal");
		*/
		
		//Approach 2 logic
		
		if(a.length==b.length) {
			
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					System.out.println("Arrays are not equal");
				}
				else System.out.println("Arrays are equal");
			}
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
	}
	 

}
