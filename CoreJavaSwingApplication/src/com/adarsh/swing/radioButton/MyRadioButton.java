package com.adarsh.swing.radioButton;

import javax.swing.*;
import java.awt.*;

public class MyRadioButton extends JFrame {

    private static final long serialVersionUID = 1L;
    private Container container;
    private MyJPanel myJPanel;

    public MyRadioButton() {
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyRadioButton r = new MyRadioButton();
    }
}
