/**
 * 
 */
package testData;

import java.util.ArrayList;

import PojoPackage.AddPlaceBody;
import PojoPackage.AddPlacePojo;
import PojoPackage.LocationPojo;
import PojoPackage.LocationPojo2;
import PojoPackage.PojoClassForUpdatePayload;

/**
 * @author Admin
 *
 */
public class AddPlacePayload {

	static AddPlacePojo payload;
	static LocationPojo location;
	static AddPlaceBody addPlace;
	static LocationPojo2 locationPay;
	
	public static AddPlacePojo payload(String name)
	{
		 payload  = new AddPlacePojo();
		 location = new LocationPojo();
		 
		 location.setLat(30.33);
		 location.setLng(25.88);
		 payload.setLocation(location);
		
		payload.setAccuracy(30);
		payload.setAddress("This is address");
		payload.setLanguage("English");
		payload.setName(name);
		payload.setPhone_number("9590");
		payload.setWebsite("https://google.com");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("zero index");
		list.add("first index");
		payload.setTypes(list);
		
		return payload;
	}
	
	public static String deletePayLoad(String place_id)
	{
		return ("{\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}\r\n"
				+ "");
	}
	
	public static PojoClassForUpdatePayload updatePayload(String address,String place_id)
	{
		PojoClassForUpdatePayload pl= new PojoClassForUpdatePayload();
		pl.setKey("qaclick123");
		pl.setAddress(address);
		pl.setPlace_id(place_id);
		return pl;
		
	}
	
	public static AddPlaceBody getAddPlaceBody() {
		
		addPlace= new AddPlaceBody();
		locationPay= new LocationPojo2();
		
		addPlace.setAccuracy(60);
		addPlace.setAddress("Davanagere");
		addPlace.setLanguage("English");
		addPlace.setName("Sadiq");
		addPlace.setPhone_number("9790");
		addPlace.setWebsite("google");
		ArrayList<String> list = new ArrayList<String>();
		list.add("shoepark");
		list.add("shop");
		addPlace.setTypes(list);
		
		locationPay.setLat(49.90);
		locationPay.setLng(56.89);
		
		addPlace.setLocation(locationPay);
		
		return addPlace;
	}
	
}
