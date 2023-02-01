package userTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;
import users.create.request.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponseBody;
import users.create.response.CreateUserSuccessResponseBody;

public class CreateUserNegativeTest {

    private UserService userService;

    @BeforeClass
    private void beforeClass(){
        userService=new UserService();
    }

    @Test
    public void shouldThrowErrorIfAnUserIsCreatedWithExistingEmail(){
        //arrange
        CreateUserRequestBody createUserRequestBody=new CreateUserRequestBody.Builder().build();
        //act
        CreateUserSuccessResponseBody createUserSuccessResponseBody = userService.createUserSuccessResponse(createUserRequestBody);

        //act
        CreateUserErrorResponseBody createUserErrorResponseBody = userService.userErrorResponse(createUserRequestBody);
        //assert
        createUserErrorResponseBody.assertUserErrorInfo(createUserRequestBody);



    }
}
