package com.adarsh.swing.checkBox;

import javax.swing.*;
import java.awt.*;

public class MyCheckBox extends JFrame {

    private static final long serialVersionUID = 1L;
    Container container;
    MyJPanel myJPanel;

    public MyCheckBox() {
        super(" ADARSH ");
        container = getContentPane();
        myJPanel = new MyJPanel();
        container.add(myJPanel);
        setSize(500, 500);
        setVisible(true);
    }

}



