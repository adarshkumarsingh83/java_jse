package com.adarsh.swing.coloChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyColorChooser extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JPanel jPanel;
    Container container;
    JButton jButton;

    public MyColorChooser() {
        container = getContentPane();
        container.setLayout(new FlowLayout());
        jButton = new JButton(" CLICK TO CHOOSE COLOR ");
        container.setBounds(50, 50, 200, 30);
        container.add(jButton);
        jButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent arg0) {
        @SuppressWarnings("unused")
        Color co = JColorChooser.showDialog(MyColorChooser.this, " Select nre Colot ", Color.white);
    }

    public static void main(String[] args) {

        JFrame jFrame = new MyColorChooser();
        jFrame.setBounds(200, 200, 400, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
