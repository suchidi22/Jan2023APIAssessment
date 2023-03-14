package com.simpletests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tc05 {

		@Test 
		public void GetUserData() {
			given().
			when().get("https://dummy.restapiexample.com/api/v1").
			then().statusCode(200);
			
			
			
		}
	
}
