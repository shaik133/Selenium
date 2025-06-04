/**
 * 
 */
package stepDefinations;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import putPayload.PutPayload;

/**
 * @author Admin
 *
 */
public class StepDefination1 {
	
	RequestSpecification req=(RequestSpecification) new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
	ResponseSpecification res= (ResponseSpecification)new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
	RequestSpecification request;
	Response response;

//	@Given("user passing update payload to call the api using key")
//	public void user_passing_update_payload_to_call_the_api_using_key()
//	{
//		 request=RestAssured.given().spec(req).body(PutPayload.payload());
//	}
//	
//	@When("Put method is sent")
//	public void Put_method_is_sent()
//	{
//		 response= request.put("/maps/api/place/update/json");
//	}
//	
//	@Then("user verifies response having status {int}")
//	public void user_verifies_response_having_status(int code)
//	{
//		assertEquals(response.getStatusCode(),code);
//		
//		
//	}
//	
//	@Then("user verifies response having {string} {string}")
//	public void user_verifies_response_having(String address, String name)
//	{
//		String resp= response.asString();
//		JsonPath js =new JsonPath(resp);
//		assertEquals(js.getString(address),name);
//	}
	@Given("user passing update payload to call the api using key")
	public void user_passing_update_payload_to_call_the_api_using_key() {
	    // Write code here that turns the phrase above into concrete actions
		request=RestAssured.given().spec(req).body(PutPayload.payload());
	}

	@When("Put method is sent")
	public void put_method_is_sent() {
	    // Write code here that turns the phrase above into concrete actions
		response= request.when().put("/maps/api/place/update/json");
	}

	@Then("user verifies response having status {int}")
	public void user_verifies_response_having_status(Integer code) {
	    // Write code here that turns the phrase above into concrete actions
				response.then().log().all();
				assertEquals(response.getStatusCode(),200);
	}

	@Then("user verifies response having {string} {string}")
	public void user_verifies_response_having(String address, String name) {
	    // Write code here that turns the phrase above into concrete actions
		String resp= response.asString();
	JsonPath js =new JsonPath(resp);
	assertEquals(js.getString(address),name);
	}

	
	}

