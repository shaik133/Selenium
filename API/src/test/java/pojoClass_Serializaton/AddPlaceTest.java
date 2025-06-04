/**
 * 
 */
package pojoClass_Serializaton;



import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * @author Admin
 *
 */
public class AddPlaceTest {
	@Test
	
	public void addPayload()
	{
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		RestAssured.given().queryParam("key", "qaclick123").body(AddPlaceApi.addPayload())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
	}

}
