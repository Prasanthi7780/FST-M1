package com.github.restassured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class GitHubSSHKeysTest {

    RequestSpecification requestSpec;
    String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg..."; // Replace with your real key
    int keyId;

    @BeforeClass
    public void setUp() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .setContentType(JSON)
                .addHeader("Authorization", "token <YOUR_GITHUB_TOKEN>")
                .build();
    }

    @Test(priority = 1)
    public void testAddSSHKey() {
        String requestBody = "{\n" +
                "  \"title\": \"TestAPIKey\",\n" +
                "  \"key\": \"" + sshKey + "\"\n" +
                "}";

        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/user/keys");

        // Extract SSH key ID
        keyId = response.jsonPath().getInt("id");

        Reporter.log("POST Response: " + response.asPrettyString(), true);

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 201, "Status code should be 201");
        Assert.assertTrue(keyId > 0, "Key ID should be greater than 0");
    }

    @Test(priority = 2)
    public void testGetSSHKey() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .get("/user/keys/{keyId}");

        Reporter.log("GET Response: " + response.asPrettyString(), true);

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        Assert.assertEquals(response.jsonPath().getInt("id"), keyId, "Key ID should match");
    }

    @Test(priority = 3)
    public void testDeleteSSHKey() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .delete("/user/keys/{keyId}");

        Reporter.log("DELETE Response: " + response.asPrettyString(), true);

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 204, "Status code should be 204");
    }
}
