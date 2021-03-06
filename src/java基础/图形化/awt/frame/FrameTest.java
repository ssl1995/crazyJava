package java基础.图形化.awt.frame;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame("test");

        Panel panel = new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("pick me"));

        frame.add(panel);
        frame.setBounds(750, 500, 500, 100);
        frame.setVisible(true);
    }
}
