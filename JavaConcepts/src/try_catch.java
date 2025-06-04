
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 4;
		int b=6;
		int c=0;

		try {
			int d= a/b;
			int e=c/b;
			System.out.println(d);
			System.out.println(e);
			System.out.println(b/c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("this  error is catched");
		}
		finally {
			System.out.println("Thsi finally executed");
		}
	}

}
