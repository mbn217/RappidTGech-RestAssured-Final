import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PostExample {
    @Test
    public void postExample(){
        /**
         * JSON body
         *
                 {
                 "name": "morpheus",
                 "job": "leader"
                 }
         *
         */

        Map<String, Object> map = new HashMap<>();
        map.put("name", "morpheus");
        map.put("job", "leader");
        System.out.println(map);
        System.out.println("------------------------------");

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "leader");
        System.out.println(request.toJSONString());


        //Post Request
        baseURI = "https://reqres.in";
        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .log().all();


    }


}
