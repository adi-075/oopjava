import java.awt.*;
public class ImprovedProgram extends Frame{ //Class extends Frame class to inherit all it's methods
    public ImprovedProgram() {
        Label firstName = new Label("First Name");
        firstName.setAlignment(Label.CENTER);
        firstName.setBackground(Color.blue);

        Button btn=new Button("Hello World");
        add(btn);         //adding a new Button.

        add(firstName); // add the label inside the frame
        setSize(300,300);
        setVisible(true); // Set visibility of Frame to true to see it's contents
    }

    public static void main(String args[]){
        ImprovedProgram imp = new ImprovedProgram();
    }
}
