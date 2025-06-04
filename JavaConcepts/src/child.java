
public class child extends parent {
	
	String ne= "name_childclass";
	
	public void getdata() {
		System.out.println(ne);
		System.out.println(super.ne);
	}
	
	public void getData() {
		System.out.println("child data");
		super.getData();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c =new child();
c.getData();
c.getdata();


	}

}
