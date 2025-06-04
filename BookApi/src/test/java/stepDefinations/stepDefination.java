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
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import utilities.AddbookPayload;
import utilities.SpecBuilders;



/**
 * @author Admin
 *
 */
public class stepDefination {

	RequestSpecification req;
	APIResources res;
	Response resp;
	String response1;
	
	@Given("addbook api hit")
	public void addbook_api_hit() throws FileNotFoundException {
		 req=RestAssured.given().spec((RequestSpecification) SpecBuilders.requestBuilder()).body(AddbookPayload.payload());
	}

	@When("user calls {string} with {string} api")
	public void user_calls_addbookApi_with_post_api(String resources,String method) {
		 res = APIResources.valueOf(resources);
		
		if(method.equalsIgnoreCase("POST"))
			 resp=req.when().post(res.getResource());
		else if(method.equalsIgnoreCase("GET"))
			resp=req.when().get(res.getResource());
		
	}

	@Then("books is added in the library")
	public void books_is_added_in_the_library() {
			 response1=resp.then().spec((ResponseSpecification) SpecBuilders.responseBuilder()).toString();
	}



	@Then("{string} should be {string}")
	public void should_be(String string, String string2) {
		assertEquals(SpecBuilders.jsonResponse(response1, "Msg"),"Successfully code");
	}
	
}
