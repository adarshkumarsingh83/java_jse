package com.adarsh.swing.mySlider;

import javax.swing.*;
import java.awt.*;

public class MyJSlider extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    MyJPanel myJPanel;

    public MyJSlider() {
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle(" JSIDER PROGRAM ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyJSlider mjs = new MyJSlider();
    }

}
