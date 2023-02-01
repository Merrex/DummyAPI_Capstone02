package blogs;
import blogs.create.request.CreateBlogPostRequestBody;
import blogs.create.response.CreateBlogPostResponse;
import blogs.delete.DeleteBlogPostResponse;
import blogs.get.GetPostErrorResponse;
import blogs.get.GetPostResponse;
import io.restassured.response.Response;


public class BlogService {
    public CreateBlogPostResponse createBlog(CreateBlogPostRequestBody body) {
        Response response=new BlogClient().create(body);
        CreateBlogPostResponse createBlogPostResponse = response.as(CreateBlogPostResponse.class);
        createBlogPostResponse.setStatusCode(response.statusCode());
        return createBlogPostResponse;
    }
    public GetPostResponse getPostById(String id) {
        Response response = new BlogClient().getByID(id);
        GetPostResponse getPostResponse=response.as(GetPostResponse.class);
        getPostResponse.setStatusCode(response.statusCode());
        return getPostResponse;
    }

    public GetPostErrorResponse getPostExpectingError(String id) {
        Response response = new BlogClient().getByID(id);
        GetPostErrorResponse getPostErrorResponse=response.as(GetPostErrorResponse.class);
        getPostErrorResponse.setStatusCode(response.statusCode());
        return getPostErrorResponse;
    }
    public DeleteBlogPostResponse deletePostById(String id) {
        Response response = new BlogClient().deleteByID(id);
        DeleteBlogPostResponse deleteBlogPostResponse=response.as(DeleteBlogPostResponse.class);
        deleteBlogPostResponse.setStatusCode(response.statusCode());
        return deleteBlogPostResponse;
    }
}
