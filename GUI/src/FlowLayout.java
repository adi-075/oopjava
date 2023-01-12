import java.awt.*;
public class FlowLayout extends Frame{ //Class extends Frame class to inherit all it's methods
    Label l1;
    Button b1;
    public FlowLayout() {
        setLayout(new java.awt.GridLayout());
        setBackground(Color.yellow);

        l1 = new Label("First Name");
        l1.setAlignment(Label.CENTER);
        l1.setBackground(Color.blue);

        b1=new Button("Hello World");
        b1.setBackground(Color.yellow);
        b1.setSize(50,50); // Set size of the button
        add(b1);         //adding a new Button.

        add(l1); // add the label inside the frame
        setSize(300,300);
        setVisible(true); // Set visibility of Frame to true to see it's contents
    }

    public static void main(String args[]){
        GLayout imp = new GLayout();
    }
}
