package com.adarsh.swing.mySlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JSlider js1, js2, js3;
    JTextField jTextField;
    MyListener myListener;
    Color c;
    int i, j, k;

    public MyJPanel() {
        this.setLayout(null);
        myListener = new MyListener();
        jTextField = new JTextField(30);
        jTextField.setBounds(50, 50, 300, 25);
        this.add(jTextField);

        myListener.setValue(this);

        js1 = new JSlider();
        js1.setMinimum(0);
        js1.setMaximum(255);
        js1.setPaintTicks(true);
        js1.setMajorTickSpacing(5);
        js1.setMinorTickSpacing(1);
        js1.setBounds(50, 100, 400, 30);
        this.add(js1);
        js1.addChangeListener(myListener);

        js2 = new JSlider();
        js2.setMinimum(0);
        js2.setMaximum(255);
        js2.setPaintTicks(true);
        js2.setMajorTickSpacing(5);
        js2.setMinorTickSpacing(1);
        js2.setBounds(50, 150, 400, 30);
        this.add(js2);
        js2.addChangeListener(myListener);

        js3 = new JSlider();
        js3.setMinimum(0);
        js3.setMaximum(255);
        js3.setPaintTicks(true);
        js3.setMajorTickSpacing(5);
        js3.setMinorTickSpacing(1);
        js3.setBounds(50, 200, 400, 30);
        this.add(js3);
        js3.addChangeListener(myListener);
    }

    private class MyListener implements ChangeListener {
        MyJPanel m;

        public void setValue(MyJPanel m) {
            this.m = m;
        }

        public void stateChanged(ChangeEvent e) {

            if (((JSlider) e.getSource()) == js1) {
                jTextField.setText(" Value 1 " + js1.getValue() + " Value 2 " + js2.getValue() + " Value 3 " + js3.getValue());
                i = js1.getValue();
                c = new Color(i, j, k);
                m.setBackground(c);
            } else if (((JSlider) e.getSource()) == js2) {
                jTextField.setText(" Value 1 " + js1.getValue() + " Value 2 " + js2.getValue() + " Value 3 " + js3.getValue());
                j = js2.getValue();
                c = new Color(i, j, k);
                m.setBackground(c);
            } else if (((JSlider) e.getSource()) == js3) {
                jTextField.setText(" Value 1 " + js1.getValue() + " Value 2 " + js2.getValue() + " Value 3 " + js3.getValue());
                k = js3.getValue();
                c = new Color(i, j, k);
                m.setBackground(c);
            }
        }
    }
}
