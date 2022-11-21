package RestassuredTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import example.RESTAPI_BDD.RestUtils;
import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND;
import io.restassured.RestAssured;
import io.restassured.internal.http.ContentTypeSubTypeExtractor;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class Demo3_Put_Request {
	public static HashMap map=new HashMap();
	public int empid=1108;
	
	@BeforeTest
	public void putData() {
		map.put("name",RestUtils.empname());
		map.put("salary", RestUtils.eslary());
		map.put("age", RestUtils.eage());
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+empid;
		
	}
	@Test
	public void testput() {
		given()
			.contentType("application/json")
			.body(map)
			
		.when()
			.put()
		.then()
			.statusCode(200)
			.and()
			.log().all();
	}

}
