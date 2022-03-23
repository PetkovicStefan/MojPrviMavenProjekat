package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import data.models.common.EmptyResponse;
import data.models.reqres.CommonUserRequest;
import data.models.reqres.CreateUserResponse;
import data.models.reqres.GetListOfUserResponse;

public class ReqresAPI {

    public static CreateUserResponse createUser(CommonUserRequest commonUserRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post("/api/user", commonUserRequest), CreateUserResponse.class);
    }

    public static GetListOfUserResponse listOfUserResponse() {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get("/api/user"), GetListOfUserResponse.class);
    }

    public static EmptyResponse deleteUser(String id) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.delete("/api/user/" + id), EmptyResponse.class);
    }
}
