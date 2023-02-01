package blogPostTest;

import blogs.BlogService;
import blogs.create.request.CreateBlogPostRequestBody;
import blogs.delete.DeleteBlogPostResponse;
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
        CreateBlogPostRequestBody createBlogPostRequestBody=new CreateBlogPostRequestBody.Builder().build();
        String id=blogService.createBlog(createBlogPostRequestBody).getId();
        //act
        DeleteBlogPostResponse deleteBlogPostResponse=blogService.deletePostById(id);
        //assert
        Assert.assertEquals(deleteBlogPostResponse.getId(),id);
        Assert.assertEquals(deleteBlogPostResponse.getStatusCode(),200);
    }
}
