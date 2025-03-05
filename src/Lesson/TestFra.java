package Lesson;

import javax.swing.*;

public class TestFra {
    public static void main(String[] args) {
        JFrame frame = new JFrame(title:"Hey");
        JLabel label = new JLabel(text:"Hey", JLabel.CENTER);
        frame.add(label);
        frame.setSize(width:400, height:400);
        frame.setVisible(true);
    }
}
