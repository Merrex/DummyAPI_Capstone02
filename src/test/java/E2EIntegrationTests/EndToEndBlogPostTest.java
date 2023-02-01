package E2EIntegrationTests;

import blogs.BlogService;
import blogs.create.request.CreateBlogPostRequestBody;
import blogs.create.response.CreateBlogPostResponse;
import blogs.delete.response.DeleteBlogPostResponse;
import blogs.get.response.GetPostResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndBlogPostTest {
    private BlogService blogService;

    @BeforeClass
    private void beforeClass(){
        blogService=new BlogService();
    }

    @Test
    public void shouldCreateGetAndDeleteBlogPost(){

        //arrange
        CreateBlogPostRequestBody createBlogPostRequestBody =new CreateBlogPostRequestBody.Builder().build();
        CreateBlogPostResponse createBlogPostResponse= blogService.createBlog(createBlogPostRequestBody);
        String id=createBlogPostResponse.getId();
        GetPostResponse getPostResponse=blogService.getPostById(id);
        //act
        DeleteBlogPostResponse deleteBlogPostResponse=blogService.deletePostById(id);
        //assert
        blogService.getPostExpectingError(id).assertError(404,"RESOURCE_NOT_FOUND");
    }
}
