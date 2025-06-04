package testData;

public class AddBookBody {
 
	
	public static String addBookBody(String isbn,String aisle) {
		return "{\"name\":\"Learn Appium Automation with Java\",\r\n"
		 		+ "\"isbn\":\""+isbn+"\",\r\n"
		 		+ "\"aisle\":\""+aisle+"\",\r\n"
		 		+ "\"author\":\"John foe\"}";
	}
	
	
	public static String randomString(int l) {
		String AlphaNumericStr = "ABCDEFGHIJKLMabcdepqrstuvxyz0123456789";
		StringBuilder s = new StringBuilder(l);

		 for ( int i=0; i<l; i++) {

		   //generating a random number using math.random()

		   int ch = (int)(AlphaNumericStr.length() * Math.random());

		   //adding Random character one by one at the end of s

		   s.append(AlphaNumericStr.charAt(ch));

		  }

		    return s.toString();
	}
}
