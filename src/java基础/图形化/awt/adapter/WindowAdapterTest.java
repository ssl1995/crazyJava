package java基础.图形化.awt.adapter;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest {
    private Frame f = new Frame("test");
    private TextField text = new TextField(20);

    public void init() {
        f.addWindowListener(new MyListener());
        f.add(text);
        f.pack();
        f.setVisible(true);
    }

    private class MyListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new WindowAdapterTest().init();
    }
}
