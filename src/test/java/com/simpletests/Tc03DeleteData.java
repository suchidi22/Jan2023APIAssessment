package com.simpletests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;



public class Tc03DeleteData {
	@Test
	public void DeleteData() {
		when()
		.delete("https://dummy.restapiexample.com/api/v1/delete/3377")
	.then().
statusCode(200)
.log().all();
	}
		
}
