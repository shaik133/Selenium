
public class child_aircraft extends parentAircraft{

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		child_aircraft a= new child_aircraft();
		a.aircraftBody();
		a.aircraftDesign();
		a.aircraftColor();
		a.getData();
		
	}
	String name="sa";
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	

	@Override
	public void aircraftColor() {
		// TODO Auto-generated method stub
		System.out.println("Thsi white color");
	}
}
	
