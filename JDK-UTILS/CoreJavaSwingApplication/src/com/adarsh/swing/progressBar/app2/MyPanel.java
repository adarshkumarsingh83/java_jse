package com.adarsh.swing.progressBar.app2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements Runnable {
    private static final long serialVersionUID = 1L;
    JProgressBar jProgressBar;
    MyListener myListener;
    JTextField jTextField;
    JButton b, b1;
    Thread thread;

    public MyPanel() {
        this.setLayout(null);
        myListener = new MyListener();

        jTextField = new JTextField(30);
        jTextField.setBounds(50, 100, 250, 30);
        this.add(jTextField);

        b = new JButton(" START ");
        b.setBounds(50, 200, 100, 30);
        this.add(b);
        b.addActionListener(myListener);

        b1 = new JButton(" STOP ");
        b1.setBounds(200, 200, 100, 30);
        this.add(b1);
        b1.addActionListener(myListener);


        jProgressBar = new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setOrientation(JProgressBar.HORIZONTAL);
        jProgressBar.setForeground(Color.red);
        jProgressBar.setBounds(30, 300, 400, 25);
        this.add(jProgressBar);
        jProgressBar.addChangeListener(myListener);
        thread = new Thread(this);
    }

    public void run() {
        try {

            while (jProgressBar.getValue() < jProgressBar.getMaximum()) {
                jProgressBar.setValue(jProgressBar.getValue() + 1);
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    private class MyListener implements ActionListener, ChangeListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                thread.start();
            } else if (e.getSource() == b1) {
                try {
                    thread.interrupt();
                    // thread.yield();
                } catch (Exception e1) {
                    System.out.println(e1);
                }
            }
        }

        public void stateChanged(ChangeEvent e) {
            jTextField.setText(" Current Value " + jProgressBar.getValue());
        }
    }

}

