package test.suites;

import calls.ReqresAPI;
import data.models.reqres.CommonUserRequest;
import data.models.reqres.CreateUserResponse;
import data.provider.ReqresProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.asserts.ReqresAssert;
import test.common.TestBase;

public class ReqresTest extends TestBase {

    CommonUserRequest commonUserRequest;
    String idOfCreatedUser;

    @BeforeMethod
    public void prepareTestData() {
        commonUserRequest = ReqresProvider.prepareUserRequest();
        idOfCreatedUser = ReqresAPI.createUser(commonUserRequest).getId();
    }

    @Test
    public void verifyCreatingUser() {
        CreateUserResponse createUserResponse = ReqresAPI.createUser(commonUserRequest);

        ReqresAssert reqresAssert = new ReqresAssert();
        reqresAssert.assertUserIsCreated(createUserResponse, commonUserRequest);
    }

    @Test
    public void verifyDeleteUser() {
        ReqresAPI.deleteUser(idOfCreatedUser);
        Assert.assertFalse(ReqresAssert.isUserExist(idOfCreatedUser), "User is not deleted");
    }
}
