package RestassuredTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Demo6_basic_validation {
	//status code validation
	@Test
	public void statuscodeTest() {
		given()
		.when()
			.get("")
		.then()
			.statusCode(200);
	}
	
	//log validation
	@Test
	public void logTest() {
		given()
		.when()
			.get("")
		.then()
			.log().all();
			}
	
	//single response validation through json path finder extension
	@Test
	public void singlelineTest() {
		given()
		.when()
			.get("")
		.then()
			.body("RestResponse.result.name", equalTo("india"));
				}
	
	//varify the multiple contents in response
	@Test
	public void multipleresponse() {
		given()
		.when()
			.get("")
		.then()
			.body("RestResponse.result.name", hasItems("India","USA","UK"));
	}
	
	//how to set param and header to request
	@Test
	public void paramtest() {
		given()
			.param("my name", "liki")
			.headers("my header", "header")
		.when()
			.get("")
		.then()
			.log().all();
	}
}
