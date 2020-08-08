package com.adarsh.swing.radioButton;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JRadioButton jrb1, jrb2, jrb3;
    JLabel jl1, jl2, jl3;
    JTextField jTextField;
    MyListener myListener = new MyListener();

    public MyJPanel() {
        setLayout(null);

        jTextField = new JTextField(30);
        jTextField.setBounds(50, 50, 250, 25);
        this.add(jTextField);

        jrb1 = new JRadioButton();
        this.add(jrb1);
        jrb1.setBounds(50, 100, 30, 30);
        jrb1.addItemListener(myListener);
        jl1 = new JLabel(" RADIO BUTTON 1");
        jl1.setBounds(100, 100, 200, 30);
        this.add(jl1);


        jrb2 = new JRadioButton();
        this.add(jrb2);
        jrb2.setBounds(50, 150, 30, 30);
        jrb2.addItemListener(myListener);
        jl2 = new JLabel(" RADIO BUTTON 2");
        jl2.setBounds(100, 150, 200, 30);
        this.add(jl2);

        jrb3 = new JRadioButton();
        this.add(jrb3);
        jrb3.setBounds(50, 200, 30, 30);
        jrb3.addItemListener(myListener);
        jl3 = new JLabel(" RADIO BUTTON 3");
        jl3.setBounds(100, 200, 200, 30);
        this.add(jl3);

    }

    private class MyListener implements ItemListener {

        public void itemStateChanged(ItemEvent e) {

            if (e.getSource() == jrb1) {
                jTextField.setText(" Radio button 1");
            } else if (e.getSource() == jrb1) {
                jTextField.setText(" Radio button 2");
            } else {
                jTextField.setText(" Radio button 3");
            }
        }
    }


}
