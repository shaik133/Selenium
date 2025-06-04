import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class javaOOPs_part2 {

	public void getSuper() {
		System.out.println("this is parent super method");
	}
	int a= 5;
	public void getLocal()
	{
		int a= 4;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a+this.a);
	}
	
public javaOOPs_part2()
{
	ArrayList<String> al= new ArrayList<String>();
	al.add("BOB");
	al.add("DEV11");
	System.out.println(al);
}
	
	public static void main(String[] args) {
// TODO Auto-generated method stub
		/*
//-------------------------date and simple date format class--------------------------
		Date d = new Date();
	System.out.println(	d.toString());
	
	SimpleDateFormat sdf= new SimpleDateFormat("d/M/yyyy");
	System.out.println(sdf.format(d));

	*/
		/*
//----------------------------using the calendar oblect	---------------------
	Calendar cal=	Calendar.getInstance();
	SimpleDateFormat sdf= new SimpleDateFormat("d/M/yyyy");
System.out.println(	sdf.format(cal.getTime()));
 System.out.println( cal.get( Calendar.DAY_OF_WEEK_IN_MONTH));
 */
		
		javaOOPs_part2 js=new javaOOPs_part2();
		js.getLocal();
		
	}

}
