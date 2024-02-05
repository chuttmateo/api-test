package com.solvd.carina.api.users;


import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APIUsersTest implements IAbstractTest {

    private String token;

    @Test
    @MethodOwner(owner = "mchutt")
    public void loginUserTest(){
        PostUser api = new PostUser();
        api.setProperties("api/users/user.properties");
        Response response = api.callAPIExpectSuccess();

        this.token = JsonPath.from(response.asString()).getString("token");
    }

    @Test(dependsOnMethods = "loginUserTest")
    @MethodOwner(owner = "mchutt")
    public void getUserByToken(){
        GetUserByToken api = new GetUserByToken();
        api.setToken(this.token);
        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }
}
