package com.rest;

import static io.restassured.RestAssured.*;

public class Test {

    @org.testng.annotations.Test
    public void login() {
        given().
                baseUri("http://studyopt1-eng.dvdnp.com").
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
