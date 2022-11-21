package serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class StudentApiwithoutSerialization {
	public HashMap hashMap = new HashMap();

	// pot create the new student
	@Test
	public void StudentData() {
		hashMap.put("id", "101");
		hashMap.put("name", "pavan");

		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("java");
		courseList.add("API");
		hashMap.put("course", courseList);

	}

	@Test
	public void postTest() {
		given().contentType(ContentType.JSON).body(hashMap).when().post("").then().statusCode(200).assertThat()
				.body("msg", equalTo("OK"));

	}

	@Test
	public void getStudentDetails() {
		given().when().get("student\101").then().statusCode(200).assertThat().body("id", equalTo("101"));

	}

}
