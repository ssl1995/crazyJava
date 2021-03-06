package java基础.图形化.swing.format;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.undo.UndoableEdit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class MonitorText {
    JFrame mainWin = new JFrame("Listen Document");

    JTextArea target = new JTextArea(4, 35);
    JTextArea msg = new JTextArea(5, 35);

    JLabel lable = new JLabel("update msg");
    Document doc = target.getDocument();

    LinkedList<UndoableEdit> undoList = new LinkedList<>();

    final int UNDO_COUNT = 20;

    public void init() {
        msg.setEditable(false);
        // 文本监听器
        doc.addDocumentListener(new DocumentListener() {

            // 插入文本时触发该方法，以下同理
            @Override
            public void insertUpdate(DocumentEvent e) {
                int offset = e.getOffset();
                int len = e.getLength();
                msg.append("插入文本的长度：" + len + "\n");
                msg.append("插入文本的起始位置：" + offset + "\n");
                try {
                    msg.append("插入文本内容：" + doc.getText(offset, len) + "\n");
                } catch (BadLocationException evt) {
                    evt.printStackTrace();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                int offset = e.getOffset();
                int length = e.getLength();
                msg.append("删除文本的长度:" + offset + "\n");
                msg.append("删除文本的起始 位置:" + length + "\n");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        // 可撤销操作的监听器
        doc.addUndoableEditListener(e -> {
            UndoableEdit edit = e.getEdit();
            if (edit.canUndo() && undoList.size() < UNDO_COUNT) {
                undoList.add(edit);
            } else if (edit.canUndo() & undoList.size() >= UNDO_COUNT) {
                undoList.pop();// 弹出第一个撤销操作
                undoList.add(edit);
            }
        });
        // 为ctrl+z添加监听器
        target.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 26) {
                    if (undoList.size() > 0) {
                        undoList.removeLast().undo();
                    }
                }
            }
        });

        Box box = new Box(BoxLayout.Y_AXIS);
        box.add(new JScrollPane(target));
        JPanel panel = new JPanel();
        panel.add(lable);
        box.add(panel);
        box.add(new JScrollPane(msg));
        mainWin.add(box);
        mainWin.pack();
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.setVisible(true);
    }

    public static void main(String[] args) {
        new MonitorText().init();
    }

}
