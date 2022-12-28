import java.util.ArrayList;
import java.util.Date;

public class Tweet {
    String content;
    String user;
    Date timestamp;
    private ArrayList<Comment> comments;
    public Tweet() {
        //System.out.println("Tweet() Called");
        content = "...";
        user = "<anonymous>";
        timestamp = new Date();
        comments = new ArrayList<Comment>();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContent(String cont) {
        content = cont;
        modifyTimestamp();
    }

    public String getContent() {  return content; }
    public String getUser() {    return user;  }
    public Date getTimestamp() {  return timestamp;  }

    private void modifyTimestamp() {
        timestamp = new Date();
    }

    public String toString() {
        return "Tweet{" +
                " user= " + user  +
                ", content='" + content +
                ", timestamp=" + timestamp +
                '}';
    }

    public void addComment(Comment c) {
        comments.add(c);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
}
