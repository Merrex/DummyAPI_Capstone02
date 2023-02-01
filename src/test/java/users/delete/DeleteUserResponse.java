package users.delete;
import lombok.Getter;
import lombok.Setter;

@Getter
public class DeleteUserResponse {
    @Setter
    private int statusCode;
    private String id;
}
