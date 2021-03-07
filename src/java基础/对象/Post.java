package java基础.对象;

public class Post {
    private String postId;
    private String postName;

    public Post() {
    }

    public Post(String postId, String postName) {
        this.postId = postId;
        this.postName = postName;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void postInfo() {
        System.out.println(
                "职务编号:" + postId + "\n" +
                "职务名称:" + postName + "\n");
    }
}
