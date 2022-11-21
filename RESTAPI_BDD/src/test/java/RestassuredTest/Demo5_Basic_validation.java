package RestassuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import groovy.util.logging.Log;

public class Demo5_Basic_validation {

	@Test
	public void testStatusCode() {
		given()
		.when()
			.get("https://jsonplaceholder.typicode.com/posts/5")
		.then()
			.statusCode(200)
			.log().all();

	}

}
