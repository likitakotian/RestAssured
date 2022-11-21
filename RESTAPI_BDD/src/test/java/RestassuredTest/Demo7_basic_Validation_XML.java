package RestassuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Demo7_basic_Validation_XML {

//verifying single response in XML content
	// XML PATH-
	@Test(priority = 1)
	public void singleContentTest() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then().body("CUTOMER.ID", equalTo("15"))
				.log().all();

	}

	// verifying multiple response in XML content
	// XML PATH-
	@Test(priority = 2)
	public void multipleContentTest() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then().body("CUTOMER.ID", equalTo("15"))
				.body("CUSTOMER.FIRSTNAME", equalTo("Bill")).body("CUTOMER.LASTNAME", equalTo("Clancy"))
				.body("CUTOMER.STREET", equalTo("319 Upland Pl.")).body("CUTOMER.CITY", equalTo("Seattle"));

	}

	// verifying multiple response in XML content
	// XML PATH-
	@Test(priority = 3)
	public void multipleContentTestinsingleline() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then()
				.body("CUTOMER.text()", equalTo("15BillClancy319 Upland PlSeattle"));
		/*
		 * .body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
		 * .body("CUTOMER.LASTNAME",equalTo("Clancy"))
		 * .body("CUTOMER.STREET",equalTo("319 Upland Pl."))
		 * .body("CUTOMER.CITY",equalTo("Seattle"));
		 */

	}
	
	//find values using XML path in XML response
	@Test(priority = 4)
	public void findvaluesusingXMLpathinXMLresponse() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				.then()
					.body(hasXPath("/CUSTOMER/FIRSTNAME"), contains("Bill"));
		
	}
	

	
}
