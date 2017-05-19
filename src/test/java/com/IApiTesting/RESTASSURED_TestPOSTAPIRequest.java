package com.IApiTesting;

import org.json.JSONObject;
import org.openqa.selenium.remote.RemoteWebDriver.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.JSONArray;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class RESTASSURED_TestPOSTAPIRequest {
	@Test
  public void TestPOSTAPIRequest() {
	  
	//Initializing Rest API's URL
		String APIUrl = "https://e2e.qbo.intuit.com/qbo1/v3/company/123146431166944/reports/execute/CUST_CONTACT";
			
		//Initializing payload or API body
		String APIBody = "{\"token\":\"CUST_CONTACT\",\"show_logo\":\"false\",\"customized\":\"yes\",\"groupby\":\"none\",\"columns\":\"~cs_customer_label%3ACustomerID%2C%3C~phone_numbers%2CPhone%3APrimaryContact%2FTelephone1%2CFax%3APrimaryContact%2FFax%2CMobile%3APrimaryContact%2FMobile%2CPager%3APrimaryContact%2FPager%3E%2C~email%3ABillingEmail%2C%7B~full_name%2CPrimaryContact%2FSalutation%2CPrimaryContact%2FFirstName%2CPrimaryContact%2FMiddleName%2CPrimaryContact%2FLastName%2CPrimaryContact%2FSuffix%7D%2C%3C~billing_address%2CBillingContact%2FAddress%2FAddressLines%2C%7BCSZ%2CBillingContact%2FAddress%2FCity%2CBillingContact%2FAddress%2FState%2CBillingContact%2FAddress%2FPostalCode%7D%2CBillingContact%2FAddress%2FCountry%3E%2C%3C~shipping_address%2CShippingContact%2FAddress%2FAddressLines%2C%7BCSZ%2CShippingContact%2FAddress%2FCity%2CShippingContact%2FAddress%2FState%2CShippingContact%2FAddress%2FPostalCode%7D%2CShippingContact%2FAddress%2FCountry%3E%2C\",\"divideby1000\":\"false\",\"hidecents\":\"false\",\"negativenums\":\"1\",\"negativered\":\"false\",\"show_header_title\":\"true\",\"show_header_range\":\"true\",\"show_footer_custom_message\":\"true\",\"show_footer_date\":\"true\",\"show_footer_time\":\"true\",\"header_alignment\":\"Center\",\"footer_alignment\":\"Center\",\"show_header_company\":\"true\",\"company_name\":\"Test_CA_CAP-T4N_1_201705151494915616880\",\"title\":\"Customer%20Contact%20List\",\"footer_custom_message\":\"\"}";
				//e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"
					
		// Building request using requestSpecBuilder
		RequestSpecBuilder builder = new RequestSpecBuilder();
			
		//Setting API's body
		builder.setBody(APIBody);
			
		//Setting content type as application/json or application/xml
		builder.setContentType("application/json; charset=UTF-8;Authorization =INTUIT_IAM x_intuit_authid= INTUIT_IAM x_intuit_authid= 123146438639669,x_intuit_ticket= V1-61-a3donyird52w7z2tiypb6k;intuit-realmid=123146431166944");
			
		RequestSpecification requestSpec = builder.build();
		
		Response response = whe
		//Making post request with authentication, leave blank in case there are no credentials- basic("","")
		Response response = given().authentication().preemptive().basic({""}, {""})
					.spec(requestSpec).when().post(APIUrl);
		JSONObject JSONResponseBody = new JSONObject(response.body().asString());

		//Fetching the desired value of a parameter
		String result = JSONResponseBody.getString({key});
			
		//Asserting that result of Norway is Oslo
		Assert.assertEquals(result, "{expectedValue}");
  }
}
