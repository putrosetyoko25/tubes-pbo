
package Fitur;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import config.connectdb;


public class Util {
    public static void sendEmail(String reception, String directory, String isi ) throws Exception{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        String email = "staycoding.m@gmail.com";
        String password = "codingcoding";

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(email,password);
                    }
                });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(reception));
            message.setSubject("Hi");

// This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");
// first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(isi);
// add it
            multipart.addBodyPart(messageBodyPart);
// second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(directory);
            messageBodyPart.setDataHandler(new DataHandler(fds));
// add image to the multipart
            multipart.addBodyPart(messageBodyPart);
// put everything together
            message.setContent(multipart);
// Send the actual HTML message, as big as you like
            Transport.send(message);
            System.out.println("Mail sent successfully!!!");

        
    }

}
