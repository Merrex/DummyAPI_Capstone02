package users;

import io.restassured.response.Response;
import users.create.request.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponseBody;
import users.create.response.CreateUserSuccessResponseBody;
import users.get.GetUserResponse;

public class UserService {

    public CreateUserSuccessResponseBody createUserSuccessResponse(CreateUserRequestBody body) {
        Response response=new UserClient().create(body);
        CreateUserSuccessResponseBody createUserSuccessResponseBody = response.as(CreateUserSuccessResponseBody.class);
        createUserSuccessResponseBody.setStatusCode(response.statusCode());
        return createUserSuccessResponseBody;
    }
    public CreateUserErrorResponseBody userErrorResponse(CreateUserRequestBody body) {
        Response response=new UserClient().create(body);
        CreateUserErrorResponseBody createUserErrorResponseBody = response.as(CreateUserErrorResponseBody.class);
        createUserErrorResponseBody.setStatusCode(response.statusCode());
        return createUserErrorResponseBody;
    }
    public GetUserResponse getAllUser(String queryParamName, int queryParamValue) {
        Response response = new UserClient().getAll(queryParamName, queryParamValue);
        GetUserResponse getUserResponse=response.as(GetUserResponse.class);
        getUserResponse.setStatusCode(response.statusCode());
        return getUserResponse;
    }

}
