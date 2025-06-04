package java_logics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="shaik sadiq";

String[] sp=a.split(" ");
String rev="";
String rev1 = "";
for(String s:sp) {
	
	 rev1="";
	for(int i=s.length()-1;i>=0;i--) {
		rev1=rev1+s.charAt(i);
		
	}
	rev=rev+rev1;
}

		System.out.println(rev);
	}
	
	

}
