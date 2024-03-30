import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class JSONScemaValidator {
    @Test
    public void jsonValidatorExample(){

        baseURI = "https://reqres.in";

        given()
                .get("/api/users?page=2")
                .then()
                .assertThat().body(matchesJsonSchemaInClasspath("json-schema-example.json"))
                .statusCode(200)
                .log().all();


    }


}
