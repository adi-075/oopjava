import java.util.Date;

public class Comment extends Tweet {



    public Comment(String content, String user, Date timestamp) {
        this.content = content;
        this.user = user;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content=" + content  +
                ", user=" + user +
                ", timestamp=" + timestamp +
                '}';
    }
}
