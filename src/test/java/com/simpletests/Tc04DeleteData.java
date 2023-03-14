package com.simpletests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tc04DeleteData {
	@Test
	public void DeleteData() {
		when()
		.delete("https://dummy.restapiexample.com/api/v1/delete/0")
	.then().
statusCode(400)
.log().all();
}
}
