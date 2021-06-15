package com.adarsh.swing.comboBox;

import javax.swing.*;
import java.awt.*;

public class MyComboBox extends JFrame {
    private static final long serialVersionUID = 1L;
    private Container container;
    MyJPanel myJPanel;

    public MyComboBox() {
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle(" COMBO BOX PROGRAM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyComboBox mcb = new MyComboBox();
    }
}
