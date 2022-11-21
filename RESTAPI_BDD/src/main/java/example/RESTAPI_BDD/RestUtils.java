package example.RESTAPI_BDD;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFN() {
		String  generatedString = RandomStringUtils.randomAlphanumeric(1);
		return ("Jhon"+  generatedString);
	}
	
	public static String getLN() {
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		return ("Jhon"+  generatedString);
	}
	
	public static String getUN() {
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		return ("Jhon"+  generatedString);
	}
	public static String getpass() {
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		return ("Jhon"+  generatedString);
	}
	public static String getemail() {
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		return ("Jhon"+  generatedString+"@gmail.com");
	}
	
	public static String empname() {
		String generatedString=RandomStringUtils.randomAlphabetic(1);
				return("Jhon"+generatedString);
	}
	public static String eslary() {
		String generatedString=RandomStringUtils.randomNumeric(6);
				return(generatedString);
	}
	public static String eage() {
		String generatedString=RandomStringUtils.randomNumeric(6);
		return(generatedString);
	}

}
