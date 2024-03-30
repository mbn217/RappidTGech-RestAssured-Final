import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetExample1 {


    @Test
    public void getRequest(){
        Response  response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().prettyPrint());
        System.out.println(response.getHeader("Content-Type"));

        Assert.assertEquals(response.getStatusCode() , 200);

    }
}
