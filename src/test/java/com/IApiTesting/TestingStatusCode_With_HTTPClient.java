package com.IApiTesting;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;
//http://www.baeldung.com/integration-testing-a-rest-api
public class TestingStatusCode_With_HTTPClient {
	@Test
	public void StatusCode() throws ClientProtocolException, IOException {
		// Given
		String name = RandomStringUtils.randomAlphabetic(8);
		HttpUriRequest request = new HttpGet("https://api.github.com/users/" + name);

		// When
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		// Then
		assertEquals((httpResponse.getStatusLine().getStatusCode()),HttpStatus.SC_NOT_FOUND);

	}
}
