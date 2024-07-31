/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.AuthenticationFailedException;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Javid Nizamdeen
 */
public class EmailSend {

    String fromE;
    String toE;
    String pwE;
    String subE;
    String mesE;
    String file;
    private static EmailSend e;
    
    public static synchronized EmailSend getInstance(){
        if(e == null){
            e = new EmailSend();
        }
        return e;
    }
    private EmailSend(){
    
    }
    public void sendMail1(String s4, String s5, String s6,String RecieveEmail) throws Exception {
        try {
            //ResultSet rs = DB.search("SELECT * FROM email");
            //if (rs.first()) {
                fromE = "piratesgroup12345@gmail.com";
                toE = RecieveEmail;
                pwE = "g62wdfap3GcwLd6";
                //System.out.println(fromE + " " + pwE);
           // }
        } catch (Exception e) {
            e.printStackTrace();
        }

        subE = s4;
        mesE = s5;
        file = s6;
        try {
            // Get system props
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "467");

            // Get the default Session object.
            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromE, pwE);
                }
            });
            // Define message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromE));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(toE));
            message.setSubject(subE);

            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText(mesE);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(file);
            multipart.addBodyPart(messageBodyPart);

            // Put parts in message
            message.setContent(multipart);

            // Send the message
            Transport.send(message);

            EmailSend e = new EmailSend();

        } catch (AuthenticationFailedException e) {
            JOptionPane.showMessageDialog(null, "Could not send the email. Security Problem", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Could not send the email. Messaging Error", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not send the email.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        

    }
    public static void main(String[] args) throws Exception {
        new EmailSend().sendMail1("Check", "Alert", "F:/MOBSYS/db/backup/backup.sql","sanjuladilky@gmail.com");
    }

}
