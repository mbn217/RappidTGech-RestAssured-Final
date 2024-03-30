import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DeleteExample {
    @Test
    public void putExample(){
        //Delete Request
        baseURI = "https://reqres.in";
        given()
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204)
                .log().all();

    }


}
