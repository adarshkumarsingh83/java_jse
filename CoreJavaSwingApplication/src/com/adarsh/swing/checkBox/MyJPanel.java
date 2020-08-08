package com.adarsh.swing.checkBox;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JCheckBox ckb1, ckb2, ckb3;
    JTextField t;
    JLabel l1, l2, l3;

    MyListener ml = new MyListener();

    public MyJPanel() {
        this.setLayout(null);

        t = new JTextField(30);
        t.setBounds(50, 50, 250, 25);
        this.add(t);

        ckb1 = new JCheckBox();
        ckb1.setBounds(50, 100, 30, 30);
        this.add(ckb1);
        ckb1.addItemListener(ml);

        l1 = new JLabel(" CHECKBOX 1");
        l1.setBounds(100, 100, 200, 30);
        this.add(l1);

        ckb2 = new JCheckBox();
        ckb2.setBounds(50, 150, 30, 30);
        this.add(ckb2);
        ckb2.addItemListener(ml);

        l2 = new JLabel(" CHECKBOX 2");
        l2.setBounds(100, 150, 200, 30);
        this.add(l2);


        ckb3 = new JCheckBox();
        ckb3.setBounds(50, 200, 30, 30);
        this.add(ckb3);
        ckb3.addItemListener(ml);

        l3 = new JLabel(" CHECKBOX 3");
        l3.setBounds(100, 200, 200, 30);
        this.add(l3);


    }

    private class MyListener implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == ckb1) {
                t.setText("CHECH BOX 1");
            } else if (e.getSource() == ckb2) {
                t.setText("CHECH BOX 2");
            } else {
                t.setText("CHECH BOX 3");
            }
        }

    }


}
