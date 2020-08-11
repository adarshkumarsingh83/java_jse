package com.adarsh.swing.progressBar.app1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JProgressBar jProgressBar;
    MyListener myListener;
    JTextField jTextField;
    JButton jButton;

    public MyJPanel() {
        this.setLayout(null);
        myListener = new MyListener();

        jTextField = new JTextField(30);
        jTextField.setBounds(50, 100, 250, 30);
        this.add(jTextField);

        jButton = new JButton(" START ");
        jButton.setBounds(50, 200, 200, 30);
        this.add(jButton);
        jButton.addActionListener(myListener);

        jProgressBar = new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setOrientation(JProgressBar.HORIZONTAL);
        jProgressBar.setForeground(Color.red);
        jProgressBar.setBounds(50, 300, 400, 30);
        this.add(jProgressBar);
        jProgressBar.addChangeListener(myListener);
    }

    private class MyListener implements ActionListener, ChangeListener {
        public void actionPerformed(ActionEvent e) {
            jProgressBar.setValue(jProgressBar.getValue() + 5);
        }

        public void stateChanged(ChangeEvent e) {
            jTextField.setText(" Current Value " + jProgressBar.getValue());
        }
    }
}
