package java基础.图形化.awt.layout;

import java.awt.*;

public class ScrollPaneTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Test");
        // 滚动窗口pane
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField(30));
        sp.add(new Button("pick me"));

        frame.add(sp);
        frame.setBounds(750, 500, 500, 100);
        frame.setVisible(true);
    }
}
