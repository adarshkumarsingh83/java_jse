package com.adarsh.swing.applet.app2;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SwingBanner extends JApplet  {
	MyPanel mp;
	Container c;
	

		public void init(){
			c=getContentPane();
			mp=new MyPanel();
			c.add(mp);
			this.setSize(1300,300);
			this.setVisible(true);
		}
	}

	@SuppressWarnings("serial")
	class MyPanel extends JPanel implements Runnable{
		Thread t;
	    String msg;
	    
		MyPanel(){
			t=new Thread(this);
			this.setBackground(Color.green);
			this.setForeground(Color.red);
			msg=" ADARSH KUMAR";
			t.start();
		}
		
		public void run(){
			char c;
			try{
				while(true){
				c=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=c;
				Thread.sleep(1000);
				repaint();
				}
				
			}catch(InterruptedException e){
				System.out.println("Exception Genratd "+e);
			}
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setFont(new Font("Monotype Cursiva",Font.BOLD,150));
			g.drawString(msg ,5,200);
		}
	}



