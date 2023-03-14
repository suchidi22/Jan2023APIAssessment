package com.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDataPOJO {
	
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

		@JsonProperty("name")
		public static String name;
		
		@JsonProperty("salary")
		private String salary;
		
		@JsonProperty("age")
	    private String age;
	    
		@JsonProperty("id")
		private String id;
}