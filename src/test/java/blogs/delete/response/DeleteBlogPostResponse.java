package blogs.delete.response;
import lombok.Getter;
import lombok.Setter;

@Getter
public class DeleteBlogPostResponse {
    @Setter
    private int statusCode;
    private String id;
}
