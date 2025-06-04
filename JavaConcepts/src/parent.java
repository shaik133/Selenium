
public class parent {
	
	public parent()// constructor
	{						
		System.out.println("constructor");
	}
	
	int i=1;
	int j=2;
	int c=i+j;
	
	public void getCata() {
		System.out.println(c);
	}
String ne= "name";

public void getData() {
	
	System.out.println("parent data");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parent p = new parent();
	}

}
