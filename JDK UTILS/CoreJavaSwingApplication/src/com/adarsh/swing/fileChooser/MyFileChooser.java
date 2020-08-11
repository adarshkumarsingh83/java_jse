package com.adarsh.swing.fileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class MyFileChooser extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JFileChooser jFileChooser;
    JButton jButton;
    JTextField jTextField;
    Container container;

    public MyFileChooser() {
        container = getContentPane();
        container.setLayout(new FlowLayout());

        jFileChooser = new JFileChooser();
        jButton = new JButton(" Display File Chooser ");

        container.add(jButton);
        jTextField = new JTextField(30);
        container.add(jTextField);
        jButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int r = jFileChooser.showOpenDialog(null);
        File f = jFileChooser.getSelectedFile();
        if (r == JFileChooser.APPROVE_OPTION) {
            jTextField.setText(f.getPath());
        } else if (r == JFileChooser.CANCEL_OPTION) {
            jTextField.setText(" You Clicked Canceled ");
        }
    }

    public static void main(String[] args) {
        JFrame f = new MyFileChooser();
        f.setBounds(200, 200, 400, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
