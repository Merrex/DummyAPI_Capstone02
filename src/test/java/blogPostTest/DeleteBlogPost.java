package blogPostTest;

import blogs.BlogService;
import blogs.delete.response.DeleteBlogPostResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBlogPost {
    private BlogService blogService;

    @BeforeClass
    private void beforeClass(){
        blogService=new BlogService();
    }

    @Test
    public void shouldDeletePostById(){
        //arrange
//        CreateBlogPostResquestBody createBlogPostResquestBody=new CreateBlogPostResquestBody.Builder().build();
//        String id=blogService.createBlog(createBlogPostResquestBody).getId();
        //act
        DeleteBlogPostResponse deleteBlogPostResponse=blogService.deletePostById("63d3b44bb3d198267fb62085");
        //assert
        Assert.assertEquals(deleteBlogPostResponse.getId(),"63d3b44bb3d198267fb62085");
        Assert.assertEquals(deleteBlogPostResponse.getStatusCode(),200);
    }
}
