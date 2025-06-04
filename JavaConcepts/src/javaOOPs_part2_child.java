
public class javaOOPs_part2_child extends javaOOPs_part2 {

	public void getSuper() {
		 System.out.println("this is child super method");
		 super.getSuper();
		 
	}
	
	public javaOOPs_part2_child() {
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		javaOOPs_part2_child js=new javaOOPs_part2_child ();
		js.getSuper();
	}

}
