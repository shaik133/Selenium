/**
 * 
 */
package com.api.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utility.Body;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Admin
 *
 */
public class ApiTest {

	
	@Test
	public void test()
	{
		
		String expectedAddress= "70 Summer walk, USA";
		//post
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=RestAssured.given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(Body.addPlaceBody())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String place_id= js.getString("place_id");
		
		//put
		String putResponse=RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+place_id+"\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json")
		.then().log().all().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();
		
		
		//get
		String getResponse= RestAssured.given().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().get("/maps/api/place/get/json")
		.then().log().all().statusCode(200).body("address", equalTo(expectedAddress)).extract().response().asString();
		
		JsonPath getJs= new JsonPath(getResponse);
		String actualAddress= getJs.getString("address");
		Assert.assertEquals(actualAddress, expectedAddress);
	}
	
	@Test(priority=2)
	public void verifyComplexJsonValidation()
	{
		System.out.println("No of courses returned by API");
		JsonPath js = new JsonPath(Body.mockResponse());
		int count=js.getInt("courses.size()");
		System.out.println(count);
		
		System.out.println("--purchace amount--");
		int amount=js.getInt("dashboard.purchaseAmount");
		System.out.println("The total purchase amount is "+amount);
		
		System.out.println("---Title of the first course--");
		System.out.println(js.getString("courses[0].title"));
		
		System.out.println("----print all courses title and respective prices---");
		for (int i=0; i<count;i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
			System.out.println(js.getInt("courses["+i+"].price"));
		}
		
		
		System.out.println("---print no of copies sold by API course(note: courses are dynamically changing their positions");
		for (int j=0; j<count;j++)
		{
			String title=js.getString("courses["+j+"].title");
			if (title.equalsIgnoreCase("RPA"))
			{
				System.out.println(js.getInt("courses["+j+"].copies"));
				break;
			}
			
		}
		
		System.out.println("----verify the sum of course price matches with puchase amount");
		int sum=0;
		for (int q=0; q<count;q++)
		{
			sum = sum+ (js.getInt("courses["+q+"].price")*(js.getInt("courses["+q+"].copies")));
			
		}
		System.out.println("Total price of the  corse is "+sum);
		Assert.assertEquals(sum, amount);
	}
	
	@Test
	public void addPlace() throws IOException
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=RestAssured.given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\Documents\\addPlace.json"))))
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
}

/*
 * {

"dashboard": {

"purchaseAmount": 910,

"website": "rahulshettyacademy.com"

},

"courses": [

{

"title": "Selenium Python",

"price": 50,

"copies": 6

},

{

"title": "Cypress",

"price": 40,

"copies": 4

},

{

"title": "RPA",

"price": 45,

"copies": 10

}

]

}



1. Print No of courses returned by API

2.Print Purchase Amount

3. Print Title of the first course

4. Print All course titles and their respective Prices

5. Print no of copies sold by RPA Course

6. Verify if Sum of all Course prices matches with Purchase Amount
*/
