package blogPostTest;

import blogs.BlogService;
import blogs.create.request.CreateBlogPostRequestBody;
import blogs.create.response.CreateBlogPostResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBlogPostTest {

    private BlogService blogService;

    @BeforeClass
    private void beforeClass(){
        blogService=new BlogService();
    }

    @Test
    public void shouldCreateBlogPost(){

        //arrange
        CreateBlogPostRequestBody createBlogPostRequestBody =new CreateBlogPostRequestBody.Builder().build();
        //act
        CreateBlogPostResponse createBlogPostResponse= blogService.createBlog(createBlogPostRequestBody);
        //assert
        createBlogPostResponse.assertBlogPost(createBlogPostRequestBody);

    }
}
