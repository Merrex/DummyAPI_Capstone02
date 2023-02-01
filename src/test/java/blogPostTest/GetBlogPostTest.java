package blogPostTest;

import blogs.BlogService;
import blogs.get.response.GetPostResponse;
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
//        CreateBlogPostResquestBody createBlogPostResquestBody=new CreateBlogPostResquestBody.Builder().build();
//        String id=blogService.createBlog(createBlogPostResquestBody).getId();
        //act
        GetPostResponse getPostResponse=blogService.getPostById("63d3b44bb3d198267fb62085");
        //assert
        Assert.assertEquals(getPostResponse.getId(),"63d3b44bb3d198267fb62085");
        Assert.assertEquals(getPostResponse.getStatusCode(),200);
    }
}
