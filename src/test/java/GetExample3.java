import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;


public class GetExample3 {


    @Test
    public void demo1(){
        baseURI = "https://reqres.in";
        //RestAssured.given().get("/api/users?page=2").then().statusCode(200);
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);

    }

    @Test
    public void demo2(){
        baseURI = "https://reqres.in";
        //RestAssured.given().get("/api/users?page=2").then().statusCode(200);
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]" , equalTo(7))
                .body("data[3].email" , equalTo("byron.fields@reqres.in"))
                .log().all();

    }



}
