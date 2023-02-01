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

    public void assertBlogPost(CreateBlogPostRequestBody createBlogPostRequestBody) {
        assertEquals(this.statusCode,200);
        assertEquals(this.getOwner().id, createBlogPostRequestBody.getOwner());
        assertEquals(this.image, createBlogPostRequestBody.getImage());
        assertEquals(this.text, createBlogPostRequestBody.getText());
        assertEquals(this.likes, createBlogPostRequestBody.getLikes());
        assertEquals(this.tags, createBlogPostRequestBody.getTags());
    }

    @Getter
    public static class Owner {
        private String firstName;

        private String lastName;

        private String id;
    }

}
