package java基础.图形化.awt.component;

import javax.swing.*;
import java.awt.*;

public class CommonComponent {
    Frame frame = new Frame("test");
    Button ok = new Button("OK");

    CheckboxGroup cb = new CheckboxGroup();
    Checkbox male = new Checkbox("male", cb, true);
    Checkbox female = new Checkbox("female", cb, false);
    Checkbox married = new Checkbox("is married?", false);

    Choice colorChoice = new Choice();

    List colorList = new List(6, true);
    TextArea ta = new TextArea(5, 20);
    TextField name = new TextField(50);

    public void init() {
        // 颜色下拉框
        colorChoice.add("red");
        colorChoice.add("green");
        colorChoice.add("blue");

        // 多行文本框
        colorList.add("red");
        colorList.add("green");
        colorList.add("blue");

        // 最后一行,布局放在最下方
        Panel bottom = new Panel();
        bottom.add(name);
        bottom.add(ok);
        frame.add(bottom, BorderLayout.SOUTH);

        //
        Panel checkPanel = new Panel();
        checkPanel.add(colorChoice);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CommonComponent().init();
    }

}
