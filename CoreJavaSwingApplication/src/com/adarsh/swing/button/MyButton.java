package com.adarsh.swing.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyButton extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    MyPanel myPanel;

    public MyButton() {
        container = getContentPane();
        myPanel = new MyPanel();
        container.add(myPanel);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyButton m = new MyButton();
    }
}


@SuppressWarnings("serial")
class MyPanel extends JPanel {

    JButton b1, b2;
    JTextField t1, t2;
    bListener bl = new bListener();

    public MyPanel() {
        this.setLayout(null);

        t1 = new JTextField(30);
        t1.setBounds(50, 50, 250, 25);
        this.add(t1);

        t2 = new JTextField(30);
        t2.setBounds(50, 100, 250, 25);
        this.add(t2);

        b1 = new JButton(" print ");
        b1.setBounds(50, 150, 100, 25);
        this.add(b1);
        b1.addActionListener(bl);

        b2 = new JButton(" clear ");
        b2.setBounds(200, 150, 100, 25);
        this.add(b2);
        b2.addActionListener(bl);

        this.setBackground(Color.gray);
        this.setForeground(Color.red);
    }

    private class bListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                t2.setText(t1.getText());
            } else {
                t1.setText("");
                t2.setText("");
            }
        }

    }

}