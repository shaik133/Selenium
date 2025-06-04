import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//--------------HashMap----------------------
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(0, "BOB");
		hm.put(1, "LON");
		hm.put(2, "CON");
		hm.put(3, "BBB");
		System.out.println(hm);
		
		Set<Entry<Integer,String>> it=hm.entrySet();
		Iterator<Entry<Integer, String>> itmap=it.iterator();
		while(itmap.hasNext())
		{
		Map.Entry mapc=(Map.Entry)itmap.next();
		System.out.println(mapc.getKey());
		System.out.println(mapc.getValue());
		}
		
		System.out.println(hm.containsKey(0));
		
		/*
	//------------------------------HashSet---------------------	
		
		HashSet<String> hs = new HashSet<String>();
		
		
		hs.add("BOB");
		hs.add("KOB");
		hs.add("BOM");
		hs.add("KOM");
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	System.out.println(	hs.contains("KOM"));
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
		System.out.println(hs);
		
		
	*/	
		
		
		
		
		
		
		//		int a[]= {1,5,1,4,8,1,6,1,4,1,8,1,6,3};
//
//ArrayList<Integer> al = new ArrayList<Integer>();
//for (int i=0; i<a.length;i++)
//{
//	int k=0;
//	if(!al.contains(a[i]))
//		
//	{
//		al.add(a[i]);
//		k++;
//		for (int j=i+1;j<a.length;j++)
//		{
//			if(a[i]==a[j]) {
//				k++;
//			}
//		}
////		System.out.println(a[i]);
////		System.out.println(k);
//		if(k==1)
//			System.out.println(a[i]);
//	}
//	
//}
//		a.add("java");
//		a.add("c++");
//		a.add("students");
//		System.out.println(a);
//	System.out.println(	a.contains("students"));
//	System.out.println(a.get(2));
//	System.out.println(a.indexOf("java"));
		
		
	}

}
