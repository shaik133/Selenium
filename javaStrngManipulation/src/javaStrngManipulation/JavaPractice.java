/**
 * 
 */
package javaStrngManipulation;

import java.util.HashSet;
import java.util.List;

/**
 * @author Admin
 *
 */
public class JavaPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method
		
String s= "This: is :automation";
System.out.println(s.charAt(5));
	
System.out.println(s.indexOf("s"));

	String[] list= s.split(":");
	for (int i=0; i<list.length;i++)
	{
		System.out.println(list[i]);
	}
	
	//reverse the string

	String name="This is my name";
	
	StringBuffer sb= new StringBuffer(name);
	StringBuffer rev=sb.reverse();
	System.out.println(rev);
	
	//Approach 2 in reverse string
	
	int count=name.length();
	String rever="";
	
	for (int i=count-1;i>=0;i--)
	{
		rever=rever+name.charAt(i);
	}
			
	System.out.println(rever);
/*---------------------------------*/
	
	int a= 123458;
	
	int reversal=0;
	
	while(a!=0)
	{
		reversal = reversal*10+a%10;
		a=a/10;
		
	}
	System.out.println(reversal);
	
	
/*---------------------------------*/

//Missing int value
int[] x= {1,2,3,5};

int b=x.length+1;

int sum=(b*(b+1))/2;

for(int i=0;i<x.length;i++)
{
	sum=sum-x[i];
}

System.out.println(sum);


/*----------------------------*/

//Find duplicate element from array using hashset

String ele[]= {"java","python","c","ruby","c"};

HashSet<String> hs= new HashSet<String>();

for (String el:ele)
{
	if(hs.add(el)==false)
	{
		System.out.println(el);
	}
}

//Find duplicate element from array using for loop

for(int i=0; i<ele.length;i++)
{
	for(int j=i+1; j<ele.length;j++) {
		if(ele[i].equalsIgnoreCase(ele[j]))
		{
			System.out.println(ele[i]);
		}
	}
	
}

//Find duplicate int element from array using hashset


int inte[]= {1,2,3,3,4,5,4};

HashSet<Integer> store= new HashSet<Integer>();
for (int in:inte)
{
	if(store.add(in)==false)
	{
		System.out.println(in);
	}
}


//Find the max value from the array

int elements[]= {1,55,75,5,36,44};

int max=elements[0];
for (int i=0;i<elements.length;i++) 
{
	if(elements[i]>max)
	{
		max=elements[i];
	}
	
}
System.out.println(max);


int q=10;

int w=5;

int t;

t=q;  //t value is 10 now

 q=w; //q value is 5  now;

w=t;// w value is 10 now

System.out.println(q);
System.out.println(w);


q=q+w;
w=q-w;
q=q-w;

System.out.println(q);
System.out.println(w);

//Swap two string

String f="Hi";
String g="bye";

 f =f+g;
 System.out.println(f);
g=f.substring(0, 2);
f=f.substring(2, f.length());
System.out.println(f);
System.out.println(g);


	}
	
	
	
	
	
}
