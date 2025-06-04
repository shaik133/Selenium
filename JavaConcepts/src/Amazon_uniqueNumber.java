import java.util.ArrayList;

public class Amazon_uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,6,7,7,8,8,9,9,1,4,7,6,3};
		ArrayList<Integer> Al= new ArrayList<Integer>();
		for (int i=0; i<a.length;i++)
		{
			int k=0;
			if(!Al.contains(a[i])) {
				Al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) 
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				if(k==1)
					System.out.println(a[i]);
//				System.out.println(a[i]);
//				System.out.println(k);
			}
		}
		
//		for (int i=0;i<a.length;i++) {
//			int k=0;
//			if(!Al.contains(a[i])) {
//				Al.add(a[i]);
//				k++;	
//				for(int j=i+1;j<a.length;j++) {
//					if(a[i]==a[j]) {
//						k++;
//					}
//				}
//				//System.out.println(a[i]);
//				//System.out.println(k);
//				if (k==1)
//						System.out.println(a[i]);
//				
//			}
//		}
		
	}

}
