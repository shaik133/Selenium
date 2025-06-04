import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question
		//Create the map table and pass the table to the Set collection and pint the key and the value seperately
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "BGM");
		hm.put(1, "CSS");
		hm.put(3, "HSS");
		System.out.println(hm);
		System.out.println(hm.get(1));
		//converting to set 
	Set<Entry<Integer, String>> sm=	hm.entrySet();
	Iterator it= sm.iterator();
	while(it.hasNext()) {
		//again casting t to map to get the value and the key
	Map.Entry mp=(Map.Entry)it.next();
System.out.println(	mp.getKey());
System.out.println(	mp.getValue());
	}
	
	}

}
