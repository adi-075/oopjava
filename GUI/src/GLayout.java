import java.awt.*;
public class GLayout extends Frame{ //Class extends Frame class to inherit all it's methods
    Label l1;
    Button b1,b2,b3,b4,b5,b6;
    GLayout() {
        //set 3x3 layout
        setLayout(new java.awt.GridLayout(3,3));
        setBackground(Color.yellow);

        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");

        // adding buttons to the frame
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String args[]){
        new GLayout();
    }
}
