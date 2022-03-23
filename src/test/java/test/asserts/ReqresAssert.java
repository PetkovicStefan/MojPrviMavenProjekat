package test.asserts;

import calls.ReqresAPI;
import data.models.reqres.CommonUserRequest;
import data.models.reqres.CreateUserResponse;
import data.models.reqres.GetListOfUserResponse;
import org.testng.asserts.SoftAssert;

public class ReqresAssert {

    public SoftAssert softAssert = new SoftAssert();

    public void assertUserIsCreated(CreateUserResponse createUserResponse, CommonUserRequest commonUserRequest) {
     this.softAssert.assertNotNull(createUserResponse.getId(), "Id is null");
     this.softAssert.assertEquals(createUserResponse.getName(), commonUserRequest.getName(), "Name didn't match");
     this.softAssert.assertEquals(createUserResponse.getJob(), commonUserRequest.getJob(), "Job didn't match");
     this.softAssert.assertNotNull(createUserResponse.getCreatedAt(), "Created at is null");
     this.softAssert.assertTrue(isUserExist(createUserResponse.getId()), "User is not displayed on list of all users");
     this.softAssert.assertAll();
    }

    public static boolean isUserExist(String id) {
        GetListOfUserResponse listOfUserResponse = ReqresAPI.listOfUserResponse();
        for (int i =0; i < listOfUserResponse.getData().size(); i++) {
            if(listOfUserResponse.getData().get(i).getId().equals(Integer.valueOf(id))) {
                return true;
            }
        }
        return false;
    }
}
