/**
 * 
 */
package stepDefinations;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.GoogleResources;
import resources.utilities;
import testData.AddPlacePayload;

/**
 * @author Admin
 *
 */
public class StepDefination extends utilities {

	RequestSpecification req;
	Response res;
	 String resp;
	JsonPath js;
	static String place_id;
	
	@Given("user sends addPlace payload with {string}")
	public void user_sends_addPlace_payload_with(String name) throws FileNotFoundException {
		 req=RestAssured.given().spec(requestBuilder().body(AddPlacePayload.payload(name)));
	}

	@When("user calls {string} with {string} method")
	public void user_calls_with_method(String resources, String method) {
		
		GoogleResources resource =  GoogleResources.valueOf(resources);
		
		if(method.equalsIgnoreCase("POST"))
			 res= req.when().post(resource.getResources());
		else if(method.equalsIgnoreCase("GET"))
			res =req.when().get(resource.getResources());
	}

	@Then("{string} should be {string}")
	public void should_be(String status, String result) {
		
		resp =res.then().spec(responseBilder()).extract().response().asString();
		System.out.println(resp);
		js = new JsonPath(resp);
		assertEquals(js.getString(status),result);
		
		
	}

	@Then("user validates the place_id maps to the {string} by using {string}")
	public void user_validates_the_place_id_maps_to_the_by_using(String actualname, String resource) throws FileNotFoundException {
		 place_id=js.getString("place_id");
		System.out.println(place_id);
		req=RestAssured.given().spec(requestBuilder().queryParam("place_id", place_id));
		 user_calls_with_method(resource,"GET");
		 resp=res.then().spec(responseBilder()).extract().response().asString();
		 js= new JsonPath(resp);
		 String expectedName=js.getString("name");
		 assertEquals(expectedName,actualname);
	}
	
//Scenario 2:
	@Given("user sends deletePlace payload")
	public void user_sends_deletePlace_payload() throws FileNotFoundException {

		req=RestAssured.given().spec(requestBuilder().body(AddPlacePayload.deletePayLoad(place_id)));
	
	}
//Scenario3:
	
	@Given("user sends updatePlace payload with {string}")
	public void user_sends_updatePlace_payload_with(String address) throws FileNotFoundException {

		req=RestAssured.given().spec(requestBuilder().body(AddPlacePayload.updatePayload(address,place_id))).queryParam("place_id", place_id);
	}
	
	


}
