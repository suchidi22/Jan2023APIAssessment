package com.simpletests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Tct01GetData {
	@BeforeClass
	public void init() {
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
	}
	
	@Test
	public void getEmployeeData() {
		Response res =RestAssured
				.given()
				.when().get("/employees");
		res.then()
		.statusCode(200);
		res.then().body("status",is("success"));
		
		
		
}
}