import java.util.ArrayList;

public class User
{
private int userId;
private String name;
private String bio;
private String rField;
private ArrayList<Post> posts;

public User(int userId, String name, String bio, String rField) {
    this.userId= userId;
    this.name = name;
    this.bio = bio;
    this.rField = rField;
    this.posts = new ArrayList<Post>();
}

public boolean addPost(Post newPost) {
    if(posts.contains(newPost)) {
        return false;
    }
    posts.add(newPost);
    return true;
}

public boolean deletePost(Post toDelete) {
    if(!posts.contains(toDelete)) {
        return false;
    }
    int toDeleteId = toDelete.getpostId();
    posts.remove(toDeleteId);
    return true;
}

public boolean editUser(String name, String bio, String rField) {
    if(this.name.equals(name) && this.bio.equals(bio)&& this.rField.equals(rField))
    {
        return false;
    }
    this.name = name;
    this.bio = bio;
    this.rField = rField;
    return true;
    
    
}



}
