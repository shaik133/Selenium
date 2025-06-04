/**
 * 
 */
package resources;

/**
 * @author Admin
 *
 */
public enum GoogleResources {

	AddPlaceApi("/maps/api/place/add/json"),
	DeletePlaceApi("/maps/api/place/delete/json"),
	GetPlaceApi("/maps/api/place/get/json"),
	PutPlaceApi("/maps/api/place/update/json");
	
	private String resources;
	GoogleResources(String resources)
	{
		this.resources= resources;
	}
	
	public String getResources()
	{
		return resources;
	}
}
