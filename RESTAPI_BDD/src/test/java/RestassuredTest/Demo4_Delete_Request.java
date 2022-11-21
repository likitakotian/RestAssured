package RestassuredTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo4_Delete_Request {
	int empid=1004;
	
	@Test
	public void DeleteRequest() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"+empid;
		//store the response into var
		Response response=
		
		given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("succesfully deleted!")
			.log().all()
			.extract().response();
		
		//response will be of JSON format now convert it into string
		String jsonAsString = response.asString();
		assertEquals(jsonAsString.contains("/succesfully deleted!"), true);
		
			
	}

}
