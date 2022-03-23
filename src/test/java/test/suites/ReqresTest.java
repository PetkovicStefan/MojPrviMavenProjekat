package test.suites;

import calls.ReqresAPI;
import data.models.reqres.CommonUserRequest;
import data.models.reqres.CreateUserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.asserts.ReqresAssert;
import test.common.TestBase;

public class ReqresTest extends TestBase {

    @Test
    public void verifyCreatingUser() {
        CommonUserRequest commonUserRequest = new CommonUserRequest("Stefan", "QA");

        CreateUserResponse createUserResponse = ReqresAPI.createUser(commonUserRequest);

        ReqresAssert reqresAssert = new ReqresAssert();
        reqresAssert.assertUserIsCreated(createUserResponse, commonUserRequest);
    }

    @Test
    public void verifyDeleteUser() {
        CommonUserRequest commonUserRequest = new CommonUserRequest("Stefan", "QA");

        CreateUserResponse createUserResponse = ReqresAPI.createUser(commonUserRequest);

        ReqresAPI.deleteUser(createUserResponse.getId());
        Assert.assertFalse(ReqresAssert.isUserCreated(createUserResponse.getId()), "User is not deleted");
    }
}
