package blogs.create.response;

import blogs.create.request.CreateBlogPostRequestBody;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static org.testng.Assert.*;

@Getter
public class CreateBlogPostResponse {

    @Setter
    private  int statusCode;
    private Owner owner;

    private String image;

    private String link;

    private String publishDate;

    private String id;

    private String text;

    private String updatedDate;

    private int likes;

    private List<String> tags;

    public void assertBlogPost(CreateBlogPostRequestBody blogPostRequestBody) {
        assertEquals(this.statusCode,200);
        assertEquals(this.getOwner().id, blogPostRequestBody.getOwner());
        assertEquals(this.image, blogPostRequestBody.getImage());
        assertEquals(this.text, blogPostRequestBody.getText());
        assertEquals(this.likes, blogPostRequestBody.getLikes());
        assertEquals(this.tags, blogPostRequestBody.getTags());
    }

    @Getter
    public static class Owner {
        private String firstName;

        private String lastName;

        private String id;
    }

}
