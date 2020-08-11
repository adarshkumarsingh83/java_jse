package com.adarsh.swing.menu;

import javax.swing.*;
import java.awt.*;

public class MyMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    JMenuBar jMenuBar;
    JMenu jm1, jm2, js1;
    String s[] = {" adarsh ", " kumar ", " amit ", " ashok ", " ashok ", " ashok "};

    public MyMenu() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("MENU BAR PROGRAM ");
        this.setBackground(Color.green);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = getContentPane();
        jMenuBar = new JMenuBar();

        jm1 = new JMenu(" ADARSH  ", true);
        for (int i = 0; i < 5; i++) {
            jm1.addSeparator();
            jm1.add(s[i]);
        }
        jMenuBar.add(jm1);

        jm2 = new JMenu(" AMIT  ", true);
        js1 = new JMenu(" AMIT  ", true);
        jm1 = new JMenu(" ADARSH  ", true);
        for (int i = 0; i < 5; i++) {
            jm2.addSeparator();
            jm2.add(s[i]);
        }
        jMenuBar.add(jm2);

        /*  jm2.add(" adarsh ");
            jm2.add(" amit ");
            jm2.add(" ashok ");
            js1.add(" adarsh ");
            js1.add(" amit ");
            js1.add(" ashok ");
            jm2.add(js1); */

        jMenuBar.add(jm2);
        setJMenuBar(jMenuBar);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyMenu m = new MyMenu();
    }
}
