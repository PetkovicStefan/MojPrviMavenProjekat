package data.provider;

import com.github.javafaker.Faker;
import common.ValueChoosers;
import data.models.reqres.CommonUserRequest;

public class ReqresProvider {

    public static CommonUserRequest prepareUserRequest() {
    CommonUserRequest commonUserRequest = new CommonUserRequest();
    commonUserRequest.setName(Faker.instance().gameOfThrones().character());
    commonUserRequest.setJob(ValueChoosers.getRandomPosition());
    return commonUserRequest;
    }
}
