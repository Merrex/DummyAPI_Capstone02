package users.create.response;

import lombok.Getter;
import lombok.Setter;
import users.create.request.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;


@Getter
public class CreateUserErrorResponseBody {

    @Setter
    private int statusCode;

    private Data data;

    private String error;

    @Getter
    public class Data {
        private String email;
        private String firstName;
        private String lastName;
    }

    public void assertUserErrorInfo(CreateUserRequestBody userRequestBody) {
        assertEquals(this.getStatusCode(), 400);
        assertNotNull(this.getError());
        assertEquals(this.getData().getEmail(), "Email already used");
    }


}
