/**
 * 
 */
package com.apitesting.qa.tests;

import org.testng.annotations.Test;

import Develop.AddPlaceBody;
import io.restassured.RestAssured;

/**
 * @author Admin
 *
 */
public class apiTest {

	
	@Test
	public void api()
	{
	String response	=RestAssured.given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(AddPlaceBody.addPlace())
		.when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
	System.out.println(response);
	
	}
}
