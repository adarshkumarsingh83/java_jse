package com.adarsh.swing.applet.app1;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SwingApplet extends JApplet {
    MyPanel myPanel;
    Container container;

    public void init() {
        container = getContentPane();
        myPanel = new MyPanel();
        container.add(myPanel);
        this.setSize(1000, 500);
        this.setVisible(true);
    }
}

@SuppressWarnings("serial")
class MyPanel extends JPanel {
    MyPanel() {
        this.setBackground(Color.green);
        this.setForeground(Color.red);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Monotype Cursiva", Font.BOLD, 100));
        g.drawString("ADARSH KUMAR", 50, 200);
    }
}

