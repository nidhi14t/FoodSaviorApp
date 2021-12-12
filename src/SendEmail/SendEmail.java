/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendEmail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;


/**
 *
 * @author nidhitiwari
 */
public class SendEmail {
    private String toEmail;
    private String fromEmail;
    private String fromEmailPassword;
    private String subject;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromEmailPassword() {
        return fromEmailPassword;
    }

    public void setFromEmailPassword(String fromEmailPassword) {
        this.fromEmailPassword = fromEmailPassword;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public SendEmail(String toEmail, String subject){
        this.toEmail=toEmail;
        this.subject = subject;
    }
    
    public SendEmail(String toEmail, String subject, String password){
        this.toEmail=toEmail;
        this.subject = subject;
        this.password = password;
    }
    
    public void sendEmailToUsers(String toEmail, String subject) {
        SendEmail se = new SendEmail(toEmail, subject);
        se.setToEmail(toEmail);
        se.setSubject(subject);
        
        Properties pro = new Properties();
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.host", "smtp.gmail.com");
        pro.put("mail.smtp.port", "587");
        
        String fromEmail = "foodsavior5100@gmail.com";
        String fromEmailPass = "5100food";
        
        
        Session session = Session.getDefaultInstance(pro, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromEmailPass);
            }
        });
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(getToEmail()));
            message.setSubject(getSubject());
            message.setText("Congratulations You have been registered with our app Food Savior");
            Transport.send(message);
              
        } catch(Exception e) {
            System.out.println("Email does not exist");
        }
    }
    
    public void sendEmailToCustomer(String toEmail, String subject, String password) {
        SendEmail se = new SendEmail(toEmail, subject, password);
        se.setToEmail(toEmail);
        se.setSubject(subject);
        se.setPassword(password);
        
        Properties pro = new Properties();
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.host", "smtp.gmail.com");
        pro.put("mail.smtp.port", "587");
        
        String fromEmail = "foodsavior5100@gmail.com";
        String fromEmailPass = "5100food";
        
        
        Session session = Session.getDefaultInstance(pro, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromEmailPass);
            }
        });
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(getToEmail()));
            message.setSubject(getSubject());
            message.setText("Congratulations You have been registered with our app Food Savior" + "Your password is " + password);
            Transport.send(message);
              
        } catch(Exception e) {
            System.out.println("Email does not exist");
        }
    }
    
    
    
    @Override
    public String toString() {
        return toEmail;
    }
}
