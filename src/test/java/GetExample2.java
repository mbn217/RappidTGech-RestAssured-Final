import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class GetExample2 {

    @Test
    public void getRequest(){

        //Removed the ResAssured Class and Replace it with static import statement
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().prettyPrint());
        System.out.println(response.getHeader("Content-Type"));

        Assert.assertEquals(response.getStatusCode() , 200);


    }


}
