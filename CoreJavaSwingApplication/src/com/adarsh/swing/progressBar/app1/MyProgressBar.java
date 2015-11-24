package com.adarsh.swing.progressBar.app1;

import javax.swing.*;
import java.awt.*;

public class MyProgressBar extends JFrame {

    private static final long serialVersionUID = 1L;
    private Container container;
    MyJPanel myJPanel;

    public MyProgressBar() {
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle(" PROGRESS BAR ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyProgressBar mp = new MyProgressBar();
    }
}
