package java基础.图形化.swing.format;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

public class JFormattedTextFieldTest {
    private JFrame mainWin = new JFrame("mainWin");
    private JButton okButton = new JButton("OK");
    private JPanel mainPanel = new JPanel();// 主要面板容器=mainPanel

    JFormattedTextField[] fields = new JFormattedTextField[6];
    String[] behaviorLabels = new String[]{
            "COMMIT", "COMMIT_OR_REVERT", "PERSIST", "REVERT"
    };
    int[] behaviors = new int[]{
            JFormattedTextField.COMMIT, JFormattedTextField.COMMIT_OR_REVERT,
            JFormattedTextField.PERSIST, JFormattedTextField.REVERT,
    };
    ButtonGroup bg = new ButtonGroup();

    public void init() {
        JPanel buttonPanel = new JPanel();// 添加按钮面板
        buttonPanel.add(okButton);
        mainPanel.setLayout(new GridLayout(0, 3));// mainPanel采用0行3列的布局
        mainWin.add(mainPanel, BorderLayout.CENTER);// mainWin添加mainPanel面板，布局采用边界居中布局

        fields[0] = new JFormattedTextField(NumberFormat.getIntegerInstance());
        fields[0].setValue(100);
        addRow("整数格式文本框:", fields[0]);

        fields[1] = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        fields[1].setValue(1);
        addRow("货币格式文本框:", fields[1]);

        fields[2] = new JFormattedTextField(DateFormat.getDateInstance());
        fields[2].setValue(new Date());// 使用默认日期格式创建
        addRow("默认的日期格式器:", fields[2]);

        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
        format.setLenient(false);// 采用严格的日期格式语法
        fields[3] = new JFormattedTextField(format);
        fields[3].setValue(new Date());
        addRow("严格的日期格式器:", fields[3]);


        try {
            DefaultFormatter formatter = new DefaultFormatter();
            formatter.setOverwriteMode(false);// 关闭overWrite状态
            fields[4] = new JFormattedTextField(formatter);
            fields[4].setValue(new URL("http://www.baidu.com"));
            addRow("URL:", fields[4]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        try {
            MaskFormatter formatter = new MaskFormatter("020-#######");
            formatter.setPlaceholderCharacter('口');
            fields[5] = new JFormattedTextField(formatter);
            fields[5].setValue("020-28309378");
            addRow("电话号码:", fields[5]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JPanel focusLostPanel = new JPanel();
        for (int i = 0; i < behaviorLabels.length; i++) {
            final int index = 1;
            final JRadioButton radio = new JRadioButton(behaviorLabels[i]);
            if (i == 1) {
                radio.setSelected(true);
            }
            focusLostPanel.add(radio);
            bg.add(radio);
            radio.addActionListener(e -> {
                if (radio.isSelected()) {
                    for (int j = 0; j < fields.length; j++) {
                        fields[j].setFocusLostBehavior(behaviors[index]);
                    }
                }
            });
        }
        focusLostPanel.setBorder(new TitledBorder(new EtchedBorder(), "请选择焦点失去后的行为"));
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(focusLostPanel, BorderLayout.NORTH);
        p.add(buttonPanel, BorderLayout.SOUTH);
        mainWin.add(p, BorderLayout.SOUTH);
        mainWin.pack();
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.setVisible(true);
    }

    private void addRow(String labelText, final JFormattedTextField field) {
        mainPanel.add(new JLabel(labelText));
        mainPanel.add(field);
        final JLabel valueLabel = new JLabel();
        mainPanel.add(valueLabel);
        // 为ok按钮添加一个事件监听器
        okButton.addActionListener(event -> {
            Object value = field.getValue();
            valueLabel.setText(value.toString());
        });
    }

    public static void main(String[] args) {
        new JFormattedTextFieldTest().init();
    }

}
