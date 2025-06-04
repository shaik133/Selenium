package java_logics;

public class ReverseStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word="Welcome To india";
		
		String[] eachWord=word.split(" ");
		
		String reversedString="";
		
		
		
		for(String w:eachWord) {
			String reversedWord="";
			for(int i=w.length()-1;i>=0;i--) {
				reversedWord=reversedWord+w.charAt(i);
			}
			reversedString=reversedString+reversedWord;
		}
		System.out.println(reversedString);
		
	}

}
