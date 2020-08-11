package com.adarsh.swing.frame;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
    MyPanel myPanel;
    Container container;

    public MyFrame() {
        super();
        container = getContentPane();
        myPanel = new MyPanel();
        container.add(myPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("ADARSH KUMAR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyFrame myFrame = new MyFrame();
    }
}

@SuppressWarnings("serial")
class MyPanel extends JPanel {
    MyPanel() {
        this.setBackground(Color.green);
        this.setForeground(Color.red);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Monotype Cursiva", Font.BOLD, 50));
        g.drawString("adarsh kumar ", 50, 100);
    }
}