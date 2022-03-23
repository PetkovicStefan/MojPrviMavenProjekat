package constants;

public class ApiEndpoints {

    //user
    public static final String USERS = "/api/user";
    public static String SINGLE_USER(String id) { return USERS + "/" + id; }
}
