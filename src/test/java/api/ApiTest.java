package api;
import io.restassured.http.ContentType;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTest extends BaseApiTest{
    String API_key = "ff3d78cec09d5ed333ba9bbf843aad6b";
    private Map<String, Object> reqBody = new HashMap<>();
    @BeforeEach
    public void setReqBody(){

        Map <String, Object> methodProperties = new HashMap<>();

        methodProperties.put("FindByString","Київ");
        methodProperties.put("Limit", "5");

        reqBody.put("apiKey",API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties",methodProperties);
    }
    @Test
    public void chekSucces(){
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalToObject (true));
    }
    @Test
    public void chekTown(){
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("data[0].Description",hasItems("Київ"));
    }
}
