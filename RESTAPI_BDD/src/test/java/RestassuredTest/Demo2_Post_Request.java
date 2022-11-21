package RestassuredTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse.BodyHandler;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import example.RESTAPI_BDD.RestUtils;
import groovy.inspect.Inspector.MemberComparator;
import io.restassured.RestAssured;
public class Demo2_Post_Request {
	
	public static HashMap map=new HashMap();
	@BeforeTest
	public void postdata() {
		
		map.put("FirstName", RestUtils.getFN());
		map.put("LastName", RestUtils.getLN());
		map.put("UserName", RestUtils.getUN());
		map.put("password", RestUtils.getpass());
		map.put("Email", RestUtils.getemail());
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
		
	}
	@Test
	public void postTest() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201) 
			.and()
			//.body(null, null)
			.body("suceesscode", equalTo("something"));
		
			
		
		
	}
}
