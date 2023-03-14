package com.simpletests;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.UserDataPOJO;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Tc02CreateData{

	
		@Test
		public void postData() {
		//extract the data
			UserDataPOJO ob = new UserDataPOJO();
		ob.setName("test");
		ob.setSalary("123");
		ob.setAge("23");
		
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("name", "test");
		map.put("salary", "123");
		map.put("age", "23");
		
		//System.out.println(map);
		//create id
		JSONObject request = new JSONObject();
		request.put("name", "test");
		request.put("salary", "123");
		request.put("age", "23");
		System.out.println(request);
		baseURI="https://dummy.restapiexample.com/api/v1";
		given()
		.contentType(ContentType.JSON).
		accept(ContentType.JSON)
				.body(request.toJSONString())
			.when()
				.post("/create")
			.then().
		statusCode(200).
		log().all();
		
		
		
		
		
		
			
		}

	}
