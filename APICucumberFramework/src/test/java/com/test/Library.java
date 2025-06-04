package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import testData.AddBookBody;

import static io.restassured.RestAssured.*;
public class Library {
	static String id;
	JsonPath js;
	@BeforeMethod
	public void initializeBaseUri() {
		RestAssured.baseURI="http://216.10.245.166";
	}
	
	@Test
	public void addPlace() {
		
	
		String response=given().body(AddBookBody.addBookBody(AddBookBody.randomString(4),AddBookBody.randomString(4))).when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		js = new JsonPath(response);
		System.out.println(js.getString("Msg"));
		String msg=js.getString("Msg");
		 id=js.getString("ID");
		 System.out.println(id);
		Assert.assertEquals(msg, "successfully added");
		
	}
	
	
	@Test(priority=1, dependsOnMethods= {"addPlace"})
	public void getbookByID() {
		System.out.println(id);
		String res=given().log().all().queryParam("ID", id).when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		js= new JsonPath(res);
		System.out.println(js.getString("book_name"));
	}
	
	@Test(priority=2)
	public void getBookDetails() {
		
		String res=given().log().all().queryParam("AuthorName", "John_foe").when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		 js= new JsonPath(res);
		System.out.println(res);	
	}
	
}
