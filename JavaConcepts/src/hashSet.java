import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hash set does not allow duplicate values
//Hash set does not follow sequential order
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("boolean");
		hs.add("null");
		hs.add("bull");
		hs.add("kill");
		System.out.println(hs);
		
//Iterator is the concept which helps to iiterate through object presnt in set
	Iterator<String> it=	hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
