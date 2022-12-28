
import java.util.ArrayList;

public class Feed {
    ArrayList<Tweet> tweets;

    Feed()
    {
        tweets = new ArrayList<Tweet>();
    }
    public void addTweet(Tweet t1)
    {
        tweets.add(t1);
    }

    public void deleteTweet( int idx ){
        tweets.remove(idx);
    }

    private void displayComments(Tweet t){
        ArrayList<Comment> coms = t.getComments();
        for( Comment c : coms) {
            System.out.println("\t" + c);
            displayComments(c);
        }
    }
    public void display(){
        for(Tweet t : tweets){
            if( t != null){
                System.out.println("\n\n"+ t);
                displayComments(t);
            }


        }
    }
}

