
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class javaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*---------------------- String split using split method operations---------*/
		
		String s="This :is :String";
		
	String[] a= s.split(":");
	for (int i=0; i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
/*-------------------String split using String Tokenizer-------*/
	
	String s1="This is :String Tokenizer";
	
	StringTokenizer st = new StringTokenizer(s1,":");
//	while(st.hasMoreTokens())
//	{
//	System.out.println(st.nextToken());
//	}
	
		Iterator<Object> it=st.asIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
/*--------------- using split and trim method----*/
		
		String s3= "Brocolli $20"; // output should be 20
		
	String result	=s3.replaceAll("[^a-zA-Z0-9]", "").substring(8, 10);//.split(" ")[0];
		
		System.out.println(result);
		
		
/*----------------- remove duplicate values from Array -------------*/
		
		String s4[]= {"java","c","python","java"};
		
		for(int i=0;i<s4.length;i++)
		{
			for(int j=i+1;j<s4.length;j++)
{
				if(s4[i].equalsIgnoreCase(s4[j]))
				{
					System.out.println(s4[i]);
				}
			}
		}
//2nd method using set
		
		HashSet<String> hs = new HashSet<String>();
		
		for (String sw: s4)
		{
			if(hs.add(sw)==false)
			{
				System.out.println(sw);
			}
		}
		
/*-----------------------remove duplicate integer from array----------*/
		
		int i[] = {1,4,3,5,3,4,2};
		
		HashSet<Integer> hsi= new HashSet<Integer>();
		for (int res:i)
		{
		if(hsi.add(res)==false)	
		{
			System.out.println(res);
		}
		}
		
//Arrays.sort(i);
//for (int j=0; j<i.length;j++)
//{
//	System.out.println(i[j]);
//}
//		
		
//sorting using swap logic

for (int j=0;j<i.length;j++)
{
	for(int h=j+1;h<i.length;h++)
	{
		if(i[j] < i[h])
		{
			int temp =i[j];
			i[j]=i[h];
			i[h]=temp;
			
		}
		
	}
	System.out.println(i[j]);
}
		
		
/*--------------------- find the max and min number --------------*/

int no[] = {22,25,44,55,88};

	int max=no[0];
	
	for (int k=0;k<no.length;k++)
	{
		if(no[k]>max)
		{
			max=no[k];
		}
		
	}
		
	System.out.println(max);	
/*-----------------------------------swap numbers using temp variable ------------*/
	
	int z= 2;
	int y=3;
	
	int temp;
	
	temp=z;
	z=y;
	y=temp;
	
	System.out.println("z value is "+z+" y value is "+y );
	
/*----------------------swap numbers without using temp variable */
	
 int c=4;
 int v=5;
 c=c+v;
v=c-v;
c=c-v;
		
System.out.println("c value is "+c+" and v value is "+v);	


/*--------------------Reversing of String-- using string buffer---------------*/

String str= "Hi There";
StringBuffer sb= new StringBuffer(str);
StringBuffer reve=sb.reverse();
System.out.println(reve);

/*----------------Reversing of String using for loop-------*/
int len= str.length();
String rev="";
for (int q=len-1;q>=0;q--)
{
	rev=rev+ str.charAt(q);
}

System.out.println(rev);

/*--------------------- Reversing of Integer ----------*/
int p= 15247;

int rever=0;

while(p!=0)
{
	rever=rever*10+p%10;
	p=p/10;
	
}
	System.out.println(rever);	
	
	
/*--------------------- Find the missing no---------*/
	
	int mis[] = {1,2,3,4,6};
	
	int n=mis.length+1;
	
	int sum=(n*(n+1))/2;
	
	for (int e=0;e<mis.length;e++)
	{
		sum=sum-mis[e];
	}
	
	System.out.println(sum);
	
/*-----------------------------find Palendrom string---------*/
	String pal="madama";
	
	String revers="";
	
	int palLen=pal.length();
	
	for (int r=palLen-1;r>=0;r--)
	{
		revers=revers+pal.charAt(r);
		
	}
	if(revers.equals(pal))
	{
		System.out.println("the given string "+revers+" is palendrome");
	}
	else
	{
		System.out.println("the given string "+revers+" is not a palendrome");
	}
	
	/*------------------------------- find distinct or unique values----*/
	
	int[] d= {1,2,1,3,1,4,2,5};
	
	for(int l=0;l<d.length;l++)
	{
		boolean isUnique=false;
		for(int m=l+1;m<d.length;m++)
		{
			if(d[l]==d[m])
			{
				isUnique=true;
			}
		}
		if(!isUnique)
		{
			System.out.println(d[l]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
