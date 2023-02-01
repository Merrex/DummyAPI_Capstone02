package userTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;
import users.create.request.CreateUserRequestBody;
import users.create.response.CreateUserSuccessResponseBody;

public class CreateUserTest {

    private UserService userService;

    @BeforeClass
    private void beforeClass(){
        userService=new UserService();
    }
    @Test
    public void shouldCreateAnUser(){
        //arrange
        CreateUserRequestBody createUserRequestBody=new CreateUserRequestBody.Builder().build();
        //act
        CreateUserSuccessResponseBody createUserSuccessResponseBody = userService.createUserSuccessResponse(createUserRequestBody);
        //assert
        createUserSuccessResponseBody.assertUserInfo(createUserRequestBody);

    }
}
