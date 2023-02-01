package userTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserSuccessResponse;

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
        CreateUserSuccessResponse createUserSuccessResponse = userService.createUser(createUserRequestBody);
        //assert
        createUserSuccessResponse.assertUserInfo(createUserRequestBody);

    }
}
