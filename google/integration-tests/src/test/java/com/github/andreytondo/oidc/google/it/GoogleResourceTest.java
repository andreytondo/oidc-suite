package com.github.andreytondo.oidc.google.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GoogleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/google")
                .then()
                .statusCode(200)
                .body(is("Hello google"));
    }
}
