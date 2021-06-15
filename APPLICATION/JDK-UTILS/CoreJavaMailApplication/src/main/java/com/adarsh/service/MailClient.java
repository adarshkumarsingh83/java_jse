package com.adarsh.service;



//set CLASSPATH=%CLASSPATH%;activation.jar;mail.jar

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class MailClient{

  public static boolean send(String[] args){

              String[] to={args[2]};
              String[] carbonCopy={args[3]};
              String[] blindCarbonCopy={"scorpio_adarsh@yahoo.com"};
              String subject=args[4];

				if(args.length >= 4){	               
                  return (MailClient.sendMail(args[5],args[0],"smtp.gmail.com","465","true",
                                       "true",true,"javax.net.ssl.SSLSocketFactory","false",to,carbonCopy,blindCarbonCopy,subject,args[1]));
				}
			return false;             
			
    }



      public synchronized static boolean sendMail(String userName,String passWord,String host,String port
																				,String starttls,String auth,boolean debug,String socketFactoryClass
																				,String fallback,String[] to,String[] cc,String[] bcc,String subject,String text){
               Properties props = new Properties();
               props.put("mail.smtp.user", userName);
               props.put("mail.smtp.host", host);
              
				if(!"".equals(port))
                 props.put("mail.smtp.port", port);

              if(!"".equals(starttls))
                props.put("mail.smtp.starttls.enable",starttls);
		          props.put("mail.smtp.auth", auth);

              if(debug){
                  props.put("mail.smtp.debug", "true");
               }else{
                   props.put("mail.smtp.debug", "false");         
              }

              if(!"".equals(port))
                props.put("mail.smtp.socketFactory.port", port);

              if(!"".equals(socketFactoryClass))
                 props.put("mail.smtp.socketFactory.class",socketFactoryClass);

              if(!"".equals(fallback))
                  props.put("mail.smtp.socketFactory.fallback", fallback);

					   try{
								Session session = Session.getDefaultInstance(props, null);
								session.setDebug(debug);
								MimeMessage msg = new MimeMessage(session);
								msg.setText(text);
								msg.setSubject(subject);
								msg.setFrom(new InternetAddress("adarshkumarsingh83@gmail.com"));
											for(int i=0;i<to.length;i++){
												msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
											}

											for(int i=0;i<cc.length;i++){
												msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
											}

											for(int i=0;i<bcc.length;i++){
												msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
											}

								msg.saveChanges();
								Transport transport = session.getTransport("smtp");
								transport.connect(host, userName, passWord);
								transport.sendMessage(msg, msg.getAllRecipients());
								transport.close();
								return true;
						}catch (Exception mex){
								mex.printStackTrace();
								return false;
						}
   }	 
}