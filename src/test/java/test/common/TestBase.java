package test.common;

import calls.CrocodilesAPI;
import data.models.crocodile.LoginRequest;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public String accessToken;

    @BeforeClass
    public void beforeClass() {
        RestAssured.baseURI = "https://reqres.in/";
//        accessToken = CrocodilesAPI.login(new LoginRequest("StefanHTEC", "test123")).getAccess();
    }
}
