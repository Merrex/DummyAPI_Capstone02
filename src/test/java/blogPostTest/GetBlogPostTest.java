package blogPostTest;

import blogs.BlogService;
import blogs.create.request.CreateBlogPostRequestBody;
import blogs.get.GetPostResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetBlogPostTest {
    private BlogService blogService;

    @BeforeClass
    private void beforeClass(){
        blogService=new BlogService();
    }
    @Test
    public void shouldGetPostById(){
        //arrange
        CreateBlogPostRequestBody createBlogPostRequestBody =new CreateBlogPostRequestBody.Builder().build();
        String id=blogService.createBlog(createBlogPostRequestBody).getId();
        //act
        GetPostResponse getPostResponse=blogService.getPostById(id);
        //assert
        Assert.assertEquals(getPostResponse.getId(),id);
        Assert.assertEquals(getPostResponse.getStatusCode(),200);
    }
}
