import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PutExample {
    @Test
    public void putExample(){

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "leader");
        System.out.println(request.toJSONString());


        //Put Request
        baseURI = "https://reqres.in";
        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .log().all();


    }


}
