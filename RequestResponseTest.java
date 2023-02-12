package lesson1;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class RequestResponseTest extends AbstractTest {
    @Test
    void getResponseData1() {
        Response response = given()
                .when()
                .get(getBaseUrl() + "recipes/715495/information?" +
                        "includeNutrition=false&apiKey=" + getApiKey());
    }
    @Test
    void getResponseData2() {
        Response response = given()
                .when()
                .get(getBaseUrl() + "recipes/715769/information?" +
                        "includeNutrition=false&apiKey=" + getApiKey());
    }
    @Test
    void getResponseData3() {
        Response response = given()
                .when()
                .get(getBaseUrl() + "recipes/715538/information?" +
                        "includeNutrition=false&apiKey=" + getApiKey());
    }
    @Test
    void getResponseData4() {
        Response response = given()
                .when()
                .get(getBaseUrl() + "recipes/659109/information?" +
                        "includeNutrition=false&apiKey=" + getApiKey());
    }
    @Test
    void getResponseData5() {
        Response response = given()
                .when()
                .get(getBaseUrl() + "recipes/648279/information?" +
                        "includeNutrition=false&apiKey=" + getApiKey());
    }
}
