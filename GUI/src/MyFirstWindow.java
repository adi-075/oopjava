import java.awt.*;
public class MyFirstWindow {
    public static void main(String args[])
    {
        Frame frame = new Frame();
        frame.setSize(400,400);

        Label lbl = new Label("Hello world of GUI!");
        lbl.setAlignment(Label.CENTER);
        lbl.setBackground(Color.blue);

        frame.add(lbl);
        frame.setVisible(true);
    }
}
