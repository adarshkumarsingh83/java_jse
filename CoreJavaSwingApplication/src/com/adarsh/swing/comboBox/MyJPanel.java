package com.adarsh.swing.comboBox;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JTextField jTextField;
    JComboBox jComboBox;
    myListener myListener;

    public MyJPanel() {
        this.setLayout(null);
        myListener = new myListener();

        jTextField = new JTextField(30);
        jTextField.setBounds(50, 50, 300, 30);
        this.add(jTextField);
        jComboBox = new JComboBox();
        jComboBox.addItem(" ADARSH KUMAR ");
        jComboBox.addItem(" AMIT KUMAR ");
        jComboBox.addItem(" ASHOK KUMAR ");
        jComboBox.addItem(" ABHISHAKE KUMAR ");
        jComboBox.addItem(" ASHISH KUMAR ");
        jComboBox.setBounds(50, 100, 200, 25);
        this.add(jComboBox);
        jComboBox.addItemListener(myListener);
    }

    private class myListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                jTextField.setText("YOU have Selected " + (String) e.getItem());
            }
        }
    }
}
