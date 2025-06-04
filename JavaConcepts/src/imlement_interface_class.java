
public class imlement_interface_class implements Interface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface a=  new imlement_interface_class();
		a.greenGo();
		a.redStop();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("walk");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

}
