package java_logics;

public class DuplicateValueInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String a[]= {"java","python","c","c++","java","python"};
		int a[]= {1,2,3,4,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate value is "+a[i]);
				}
			}
		}
	}

}
