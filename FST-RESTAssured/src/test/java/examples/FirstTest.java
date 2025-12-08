package examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class FirstTest {
// GET https://petstore.swagger.io/v2/pet/findByStatus?status=sold

	@Test
	
public void getRequestWithQueryParam() {
// Send request, save the response
Response response = RestAssured.given().
// Request spec
baseUri("https://petstore.swagger.io/v2").
header("Content-Type", "application/json").
queryParam("status", "sold").
// Send request and receive response
when().get("/pet/findByStatus");

//Get the response status code
System. out.println("Status Code: " + response.getStatusCode());
//Get the response headers
System. out.println("Headers: \n" + response.getHeaders());
//Get the response body
System.out.println("Body: \n"+ response.getBody().asString());
System.out.println("Body: \n" + response.getBody().asPrettyString());
//Extract json properties using jsonpath
String petStatus = response.then().extract().path("[0].status");
}

// GET https://petstore.swagger.io/v2/pet/{petId}

}