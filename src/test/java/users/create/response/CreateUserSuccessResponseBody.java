package users.create.response;

import lombok.Getter;
import lombok.Setter;
import users.create.request.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Getter
public class CreateUserSuccessResponseBody {

    @Setter
    private  int statusCode;
    private String firstName;
    private String lastName;
    private String id;
    private String updatedDate;
    private String email;
    private String registerDate;

    public void assertUserInfo(CreateUserRequestBody userRequestBody) {
        assertEquals(this.getStatusCode(),200);
        assertNotNull(this.getId());
        assertEquals(this.getFirstName(),userRequestBody.getFirstName());
        assertEquals(this.getLastName(),userRequestBody.getLastName());
        assertEquals(this.getEmail(),userRequestBody.getEmail());

    }

}
