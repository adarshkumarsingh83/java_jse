package com.adarsh.swing.jList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    myListener myListener;
    JList jList;
    JScrollPane jScrollPane;
    JTextField jTextField;
    String s[] = {" ADARSH ", " AMIT ", " SONU ", " MONU ", " Ashok ", " Nitin ", " Deepsk ", " kumsr ", " Singh "};

    public MyJPanel() {
        setLayout(null);

        jTextField = new JTextField(30);
        jTextField.setBounds(50, 50, 200, 20);
        this.add(jTextField);
        myListener = new myListener();

        jList = new JList(s);
        jScrollPane = new JScrollPane(jList);
        jList.setVisibleRowCount(2);
        jScrollPane.setBounds(50, 100, 200, 40);

        this.add(jScrollPane);
        jList.addListSelectionListener(myListener);

    }

    private class myListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            jTextField.setText("YOU have " + jList.getSelectedIndex() + "" + jList.getSelectedValue());
        }
    }

}
