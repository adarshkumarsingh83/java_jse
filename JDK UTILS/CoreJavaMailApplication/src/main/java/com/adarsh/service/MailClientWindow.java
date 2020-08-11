package com.adarsh.service;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MailClientWindow implements ActionListener {
	   
	
	private static JPanel jPanelObject;	 
    public static JScrollPane jScrollPane;    
	private static JFrame jFrameObject=null;
	public static JTextArea jTextAreaMessagebox;
	private static JButton jButtonSend,jButtonClear,jButtonClose=null;	  
	private static JTextField jTextFieldTo,jTextFieldSenderId,jTextFiledCc,jTextFiledPwd,jTextFiledSubject=null;
   
    
	public static void main(String[] args)throws Exception {
		try{		
            new MailClientWindow().initialisation();	    
		}catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}					
   }
	
	public void initialisation(){
	
		  JFrame.setDefaultLookAndFeelDecorated(true);
		  jFrameObject = new JFrame("Mail Application");
		  jPanelObject = new JPanel();
		  jPanelObject.setLayout(null);
		  jPanelObject.setBackground(new Color(219,222,213));
		  
		  
		  JLabel jLabelTo= new JLabel(" To :");
		  jLabelTo.setBounds(40, 40,100, 50);
		  
		  jTextFieldTo = new JTextField();
		  jTextFieldTo.setBounds(90, 50, 250, 25);
		  
		  JLabel jLabelCc= new JLabel(" Cc : ");
		  jLabelCc.setBounds(40,75,100,50);
		  
		  jTextFiledCc = new JTextField(10);
		  jTextFiledCc.setBounds(90, 85, 250, 25);
		  
		  JLabel jLabelSubject= new JLabel(" Sub : ");
		  jLabelSubject.setBounds(40,110,100,50);
		  
		  jTextFiledSubject=new JTextField();
		  jTextFiledSubject.setBounds(90, 120, 250, 25);
		  		  
		  JLabel jLabelMessage= new JLabel(" Msg : ");
		  jLabelMessage.setBounds(40,145,100,50);		  
		  
		  jTextAreaMessagebox = new JTextArea();
		  jScrollPane=new JScrollPane(jTextAreaMessagebox);
		  jScrollPane.setBounds(90,155,500,150);
		  
		  JLabel jLabelSenderId= new JLabel(" Sender  : ");
		  jLabelSenderId.setBounds(40,310,100,50);
		  
		  jTextFieldSenderId=new JTextField();
		  jTextFieldSenderId.setBounds(90, 320, 250,25);
		  
		  JLabel jLabelPwd= new JLabel(" Pwd: ");
		  jLabelPwd.setBounds(40,355,100,50);
		  
		  jTextFiledPwd = new JPasswordField(10);		  
		  jTextFiledPwd.setBounds(90, 365, 250, 25);
		 
		  
		 /* JLabel jLabelPwd= new JLabel(" Pwd: ");
		  jLabelPwd.setBounds(40,145,100,50);
		  
		  jTextFiledPwd = new JPasswordField(10);		  
		  jTextFiledPwd.setBounds(90, 155, 250, 25);
		 
		  
		  JLabel jLabelMessage= new JLabel(" Msg : ");
		  jLabelMessage.setBounds(40,180,100,50);		  
		  
		  jTextAreaMessagebox = new JTextArea();
		  jScrollPane=new JScrollPane(jTextAreaMessagebox);
		  jScrollPane.setBounds(90,190,500,150);*/
		  
		 /* JLabel jLabelSenderId= new JLabel(" Sender id  : ");
		  jLabelMessage.setBounds(40,180,100,50);
		  
		  jTestFieldSenderId=new JTextField();
		  jTestFieldSenderId.setBounds(x, y, width, height);*/
		  
		  jButtonSend = new JButton("Send");
		  jButtonSend.setBounds(80, 400, 90, 30);
		  
		  jButtonClear = new JButton("Clear");
		  jButtonClear.setBounds(210, 400, 90, 30);
		  
		  jButtonClose = new JButton("Discard");
		  jButtonClose.setBounds(340, 400, 90, 30);
  		  
		  jPanelObject.add(jLabelTo);		  
		  jPanelObject.add(jLabelCc);
		  jPanelObject.add(jLabelSubject);
		  jPanelObject.add(jLabelSenderId);
		  jPanelObject.add(jLabelPwd);
		  jPanelObject.add(jLabelMessage);
		  
		  jPanelObject.add(jTextFieldTo);
		  jPanelObject.add(jTextFiledCc);
		  jPanelObject.add(jTextFiledSubject);
		  jPanelObject.add(jTextFieldSenderId);
		  jPanelObject.add(jTextFiledPwd);
		  
		  jPanelObject.add(jButtonSend);
		  jPanelObject.add(jButtonClear);		 
		  jPanelObject.add(jButtonClose);
		  
		  jPanelObject.add(jScrollPane);
		
		  jFrameObject.add(jPanelObject);				  
		  jScrollPane.setAutoscrolls(true);				

		  jButtonSend.addActionListener(this);		
		  jButtonClear.addActionListener(this);		  
		  jButtonClose.addActionListener(this);
		  
	
		  jFrameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jFrameObject.setSize(700,500);
		  jFrameObject.setVisible(true);
		
	  }
	
	
   
	    
		public void actionPerformed(ActionEvent eventObject) { 							
			 try{
				     if(eventObject.getActionCommand().equals("Send")){											
						if(MailClient.send(new String[]{jTextFiledPwd.getText(), jTextAreaMessagebox.getText(), jTextFieldTo.getText(), jTextFiledCc.getText(), jTextFiledSubject.getText(), jTextFieldSenderId.getText()})){
							JOptionPane.showMessageDialog(null, "mail send sucessfully");
						}else{
							JOptionPane.showMessageDialog(null, "mail not send ");
						}
					 }
				     
				     if(eventObject.getActionCommand().equals("Discard")){					 				   
							System.exit(1);
						}
						
					if(eventObject.getActionCommand().equals("Clear")){					 				   
						jTextAreaMessagebox.setText("");					
						jTextFieldTo.setText("");
						jTextFiledCc.setText("");
						jTextFiledSubject.setText("");
						jTextFieldSenderId.setText("");
						jTextFiledPwd.setText("");					
					}
	
			 }catch(Exception exceptionObject){
				 exceptionObject.printStackTrace();
			}
	   }
}
		
   
		