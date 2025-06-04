
public class overridingChild  {

	String name;
	static String city="Banglore";
	int empId;
	
	public overridingChild(String name,  int empId) {
		this.name=name;
		
		this.empId= empId;
	}
	
	public void getChild() {
		System.out.println(name+" "+city+" "+empId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overridingChild a = new overridingChild("BOB",101);
	a.getChild();
	}

}
