package com.apitesting.programs;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAPI {

	ObjectMapper mapper = new ObjectMapper();
	String filePath = "";

	@BeforeTest
	public void bf() {
		System.out.println("This is from Before Test!");
		filePath = System.getProperty("user.dir") + "/src/test/java/testdata/jsonSample.json";
		System.out.println("File Path : " + filePath);
	}

	@Test
	public void testAPIData1() throws JsonParseException, JsonMappingException, IOException {
		User user = mapper.readValue(new File(filePath), User.class);
		assertEquals(user.getFirstName().equals("Ravi"), true);

	}

	@Test
	public void testAPIData2() throws JsonParseException, JsonMappingException, IOException {
		User user = mapper.readValue(new File(filePath), User.class);
		assertEquals(user.getFirstName().equals("G"), false);

	}
}
