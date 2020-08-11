package com.adarsh.swing.jList;

import javax.swing.*;
import java.awt.*;

public class MyJList extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    MyJPanel myJPanel;

    public MyJList() {
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("ADARSH KUMAR ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyJList m = new MyJList();
    }

}
