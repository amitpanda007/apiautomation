package com.rest.tests;

import com.rest.utils.ConfigLoader;

import static io.restassured.RestAssured.*;

public class Test {

    @org.testng.annotations.Test
    public void login() {
        given().
                baseUri(ConfigLoader.getInstance().getBaseUrl()).
                header("authorization", "Basic YW1pdHBhbmRhOlBhNTV3b3Jk").
                header("command", "login").
                header("tenantid", "tenant1").
        when().
                get("/api/login").
        then().
                log().all().
                assertThat().
                statusCode(200);
    }
}
