package com.adarsh.swing.popUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MyPopup extends JFrame {
    JMenuItem mi1, mi2, mi3;
    JPopupMenu jPopupMenu;
    Container container;
    myListener ml;
    JPanel jp = new JPanel();

    public MyPopup() {
        container = getContentPane();
        jPopupMenu = new JPopupMenu();
        mi1 = new JMenuItem("red");
        jPopupMenu.add(mi1);
        jPopupMenu.addSeparator();
        mi2 = new JMenuItem("green");
        jPopupMenu.add(mi2);
        jPopupMenu.addSeparator();
        mi3 = new JMenuItem("yellow");
        jPopupMenu.add(mi3);
        jPopupMenu.addSeparator();
        jPopupMenu.add("yellow");
        ml = new myListener();
        mi1.addActionListener(ml);
        mi2.addActionListener(ml);
        mi3.addActionListener(ml);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                displayPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                displayPopup(e);
            }

            public void displayPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    private class myListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mi1) {
                container.setBackground(Color.red);
            } else if (e.getSource() == mi2) {
                container.setBackground(Color.green);
            } else if (e.getSource() == mi3) {
                container.setBackground(Color.yellow);
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new MyPopup();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
