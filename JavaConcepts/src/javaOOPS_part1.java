import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaOOPS_part1 {
	
	public javaOOPS_part1() {
		System.out.println("This is constructor");
	}
	
	public javaOOPS_part1(int a, int b) {
	int	c=a+b;
	System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		//-----------Constructor-------------
		what is constructor?
			constructor executes the block of the code whenever there is object created for that class
				
				1. Constructor will not return any values
				2. constructor name should be same as class name
		eg:
			create the constructor outside the main block
			
			when you create object for this javaOOPS_part1 class then automatically the above defined constructor is called.
			
			javaOOPS_part1 jp= new javaOOPS_part1(4,5);
	*/			
		
/*		
//-------------	Date concept---------------	
	Calendar cal	=Calendar.getInstance();
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	
		*/
	/*
		//Defining Array
		int a[] = {1,5,8,9,7};
		//extracting the array data
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
/*		
//Multidimensional arrays
		
		int a[][]= {{1,2,4},{4,5,9}};
		
		for (int i=0; i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
	*/
	
		/*
	//	matrix
		int a[][]= {{1,2,4},{4,5,9}};
		int min=a[0][0];
		int mincolumn=0;
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				if (a[i][j]<min) {
					min=a[i][j];
					mincolumn=j;
				}
			}
			System.out.println(min);
		}
		
	int k=0;
	int max=a[0][mincolumn];
	while(k<2) {
		if(a[k][mincolumn]>max) {
			max=a[0][mincolumn];
		}
		k++;
	}
	System.out.println(max);
	*/
 //---------------Nested loops---------------      
	/*	int k=1;
		for (int i=0;i<4;i++) {
			for (int j=1;j<=1+i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		
	}
	*/
/*	what is interface?
Interface and class lies on the same line but the major difference in interface is... in interface we create only the methods body will not created
2. Interface can be called to the class by using the keyword called implements
3. multiple interface can be defined in one class
4. all the methods in the interface are abstract  menthods
*/

		/*
		what are the abstract class?
	
	abstract class includes methods which are not implemented also includes the method with imlementation
	those are called abstract methods
	
	If a class consists of abstact method then the class itself a abstract class.
	abstract class can be called to main class by using the extends keyword
	*/
		
/*		Inheritance?
		Inheriting the propertes of parent class to child class
		multiple inheritence can not be done in one class
		
		*/
	/*	
		what is overloading?
				a class having 2 methods of same method name called overloading
				Rules of having overloading..
				a class can have methods of same name but arguments should be diff either count or datatype should be diffrent
				*/
	/*	
		what is overriding?
				overriding the property of parent class in child class
				*/
		
		//Arrays
		
		
		
	}

}