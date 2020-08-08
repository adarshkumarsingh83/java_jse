package com.adarsh.swing.progressBar.app2;

import javax.swing.*;
import java.awt.*;

public class MyProgressBarAuto extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    MyPanel myPanel;

    public MyProgressBarAuto() {
        container = getContentPane();
        myPanel = new MyPanel();
        container.add(myPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle(" PROGRESS BAR AUTO ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyProgressBarAuto m = new MyProgressBarAuto();
    }
}
