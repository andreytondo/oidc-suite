package com.github.andreytondo.oidc.core.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CoreResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/core")
                .then()
                .statusCode(200)
                .body(is("Hello core"));
    }
}
