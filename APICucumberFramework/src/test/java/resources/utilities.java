/**
 * 
 */
package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * @author Admin
 *
 */
public class utilities {

	static String resp;
	static RequestSpecification request;
	
	public static RequestSpecification requestBuilder() throws FileNotFoundException
	{
		if(request==null)
		{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		 request = (RequestSpecification) new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log)).addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).addFilter(ResponseLoggingFilter.logResponseTo(log)).setBaseUri("https://rahulshettyacademy.com").build();
		
		}
		return request;
	}
	
	public static ResponseSpecification responseBilder()
	{
		ResponseSpecification response = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		return response;
	}
	

}
