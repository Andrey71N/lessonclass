package lesson1;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Example1Test extends AbstractTest{

    @Test
    void getSpecifyingRequestDataTest1(){
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title","Turkey Tomato Cheese Pizza")
                .when()
                .post(getBaseUrl()+"recipes/cuisine")
                .then()
                .statusCode(200);

    }
    @Test
    void getSpecifyingRequestDataTest2(){
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title","Broccolini Quinoa Pilaf")
                .when()
                .post(getBaseUrl()+"recipes/cuisine")
                .then()
                .statusCode(200);

    }
    @Test
    void getSpecifyingRequestDataTest3(){
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title","What to make for dinner tonight?? Bruschetta Style Pork & Pasta")
                .when()
                .post(getBaseUrl()+"recipes/cuisine")
                .then()
                .statusCode(200);

    }
    @Test
    void getSpecifyingRequestDataTest4(){
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title","Salmon Quinoa Risotto")
                .when()
                .post(getBaseUrl()+"recipes/cuisine")
                .then()
                .statusCode(200);

    }
    @Test
    void getSpecifyingRequestDataTest5(){
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title","Italian Tuna Pasta")
                .when()
                .post(getBaseUrl()+"recipes/cuisine")
                .then()
                .statusCode(200);

    }
}
