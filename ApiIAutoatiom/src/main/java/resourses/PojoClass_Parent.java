/**
 * 
 */
package resourses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Admin
 *
 */
public class PojoClass_Parent {
	
	public static PojoClass_Parent payload ;
	
	private Location location;
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private List<String> types;
	private String website;
	private String language;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public static PojoClass_Parent getpayload()
	{
		payload = new PojoClass_Parent();
		Location lc= new Location();
		lc.setLat(25.33);
		lc.setLng(33.56);
		payload.setLocation(lc);
		payload.setAccuracy(30);
		payload.setAddress("this is address");
		payload.setLanguage("English");
		payload.setName("my name");
		payload.setPhone_number("9595");
		payload.setWebsite("http://google.com");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		payload.setTypes(list);
		return payload;
	}

}
