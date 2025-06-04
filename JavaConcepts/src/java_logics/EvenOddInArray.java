package java_logics;

import java.util.ArrayList;

public class EvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		ArrayList<Integer> even= new ArrayList<>();
		ArrayList<Integer> odd= new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		
		for(int ev:even) {
			System.out.println("Even numbers are "+ ev);
		}
		for(int od:odd) {
			System.out.println("odd numbers are "+od);
		}
	}

}
