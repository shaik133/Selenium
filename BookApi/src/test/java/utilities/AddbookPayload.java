/**
 * 
 */
package utilities;



import java.util.Random;

import resources.PojoAddBook;

/**
 * @author Admin
 *
 */
public class AddbookPayload {

	static PojoAddBook addbook = new PojoAddBook();
	static String randomName;
	
	public static PojoAddBook payload()
	{
		addbook.setAuthor("Kiosk");
		addbook.setName("misle");
		addbook.setAisle(randomName);
		addbook.setIsbn(randomName);
		return addbook;
	}
	
	public String randomNames()
	{
		String alpha= "ABCDEFGHIJKLMNOPQRS";
		StringBuilder sb = new StringBuilder();
		Random random= new Random();
		int length= 5;
		for (int i=0; i<length;i++)
		{
			int index =random.nextInt(alpha.length());
			char randomChar=alpha.charAt(index);
			
			randomName	=sb.append(randomChar).toString();
		}
		return randomName;
	}
	
}
