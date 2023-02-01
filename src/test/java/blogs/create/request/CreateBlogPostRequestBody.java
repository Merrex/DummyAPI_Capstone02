package blogs.create.request;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CreateBlogPostRequestBody {

    private String owner;

    private String image;

    private String text;

    private int likes;

    private List<String> tags;


    public CreateBlogPostRequestBody(Builder builder) {
        this.owner=builder.owner;
        this.image=builder.image;
        this.text=builder.text;
        this.likes=builder.likes;
        this.tags=builder.tags;
    }
    public static class Builder{
        private String owner;
        private String image;
        private String text;
        private int likes;
        private List<String> tags;
        public Builder(){
            List<String>tag=new ArrayList<>();
            tag.add("#new");

            this.owner="63be48b5d1eb2dba0c55e2b2";
            this.image="https: //t4.ftcdn.net/jpg/03/03/62/45/240_F_303624505_u0bFT1Rnoj8CMUSs8wMCwoKlnWlh5Jiq.jpg";
            this.text="this is new post";
            this.likes=0;
            this.tags= tag;
        }

        public Builder tags(List<String> tagList){
            this.tags=tagList;
            return this;
        }
        public Builder image(String url){
            this.image=url;
            return this;
        }
        public CreateBlogPostRequestBody build(){
            CreateBlogPostRequestBody createBlogPostRequestBody = new CreateBlogPostRequestBody(this);
            return createBlogPostRequestBody;
        }
    }

}
