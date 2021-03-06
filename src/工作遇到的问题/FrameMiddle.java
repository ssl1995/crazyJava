package 工作遇到的问题;

import javax.swing.*;
import java.awt.*;


public class FrameMiddle {
    public static void main(String[] args) {
        int screenWidth = (Toolkit.getDefaultToolkit().getScreenSize().width);
        int screenHeight = (Toolkit.getDefaultToolkit().getScreenSize().height);
        JFrame frame = new JFrame();
        frame.setBounds(
                screenWidth / 2 - 300,
                screenHeight / 2 - 300,
                600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
