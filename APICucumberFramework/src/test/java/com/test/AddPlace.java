package com.test;

import org.testng.annotations.Test;

import PojoPackage.AddPlaceResponsePojo;
import io.restassured.RestAssured;
import testData.AddPlacePayload;

import static io.restassured.RestAssured.*;
public class AddPlace {

	

	@Test
	public void addPlace() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		AddPlaceResponsePojo addPlaceResp=given().body(AddPlacePayload.getAddPlaceBody()).queryParam("key", "qaclick123").when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().as(AddPlaceResponsePojo.class);
		
		String id=addPlaceResp.getPlace_id();
		System.out.println(id);
		
	}
	
}
