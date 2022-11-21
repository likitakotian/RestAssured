package RestassuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//given() add param,set cookies,set headerinfo
//when() get,post,put
//then() validtae status code,header info,response body
public class Demo1_get_request {
	
	
	@Test
	public void getWeatherDetails() {
		given()
		.when()
				.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusCode(200)
			.assertThat().body("City",equalTo("Hyderabad"));
		
	}

}
