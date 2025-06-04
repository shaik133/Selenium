
public class staticVar {

	String name;
	String address;
	static String city="Banglore";
	
	public staticVar(String name, String address) {
		
		this.name=name;
		this.address=address;
		
	}
	
	public void getData() {
		System.out.println(name+" "+address+" "+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar sv = new staticVar("BOB","Whitefield");
		staticVar sv1 = new staticVar("Dev11","marathhalli");
		sv.getData();
		sv1.getData();
		parent p= new parent();
		p.getCata();
	}

}
