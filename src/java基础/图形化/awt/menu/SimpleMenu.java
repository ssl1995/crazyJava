package java基础.图形化.awt.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleMenu {
    private Frame frame = new Frame("test");
    private MenuBar menuBar = new MenuBar();

    Menu file = new Menu("file");
    Menu edit = new Menu("edit");

    MenuItem newItem = new MenuItem("newItem");
    MenuItem saveItem = new MenuItem("saveItem");
    // exitItem指定用:ctrl+x
    MenuItem exitItem = new MenuItem("exit", new MenuShortcut(KeyEvent.VK_X));

    CheckboxMenuItem autoWrap = new CheckboxMenuItem("autoWrap");

    MenuItem copyItem = new MenuItem("copy");
    MenuItem pasteItem = new MenuItem("paste");

    Menu format = new Menu("format");
    // commentItem:指定用ctrl+shift+/
    MenuItem commentItem = new MenuItem("comment", new MenuShortcut(KeyEvent.VK_SLASH, true));

    MenuItem cancelItem = new MenuItem("cancel");

    private TextArea ta = new TextArea(6, 40);

    public void init() {
        // 拉姆达表达式创建菜单事件监听器
        ActionListener menuListener = e -> {
            String cmd = e.getActionCommand();
            ta.append("one click " + cmd + " menu " + "\n");
            if (cmd.equals("exit")) {
                System.exit(0);
            }
        };

        commentItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);

        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);

        edit.add(autoWrap);
        edit.addSeparator();// 添加菜单分隔线
        edit.add(copyItem);
        edit.add(pasteItem);

        format.add(commentItem);
        format.add(cancelItem);

        edit.add(new MenuItem("-"));
        edit.add(format);

        menuBar.add(file);
        menuBar.add(edit);

        frame.setMenuBar(menuBar);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(ta);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleMenu().init();
    }

}
