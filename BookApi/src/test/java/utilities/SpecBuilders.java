/**
 * 
 */
package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


/**
 * @author Admin
 *
 */
public class SpecBuilders {

	
	public static RequestSpecBuilder requestBuilder()
	{
		RequestSpecBuilder req=  new RequestSpecBuilder().setBaseUri("http://216.10.245.166").setContentType(ContentType.JSON);
		return req;
	}
	public static ResponseSpecBuilder responseBuilder()
	{
		ResponseSpecBuilder res =  new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200);
		return res;
	}
	
	public static JsonPath jsonResponse(String res, String keyValue)
	{
		JsonPath js = new JsonPath(res);
		return js.get();
	}
	
}
