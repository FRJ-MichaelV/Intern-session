import javax.net.ssl.SSLSession;
import java.util.Properties;

public class EmailService {
    public static void sendEmail(String to, String subject, String message){
        final String username = "albertmick4517@gmail.com";
        final String password = "harry@2110_android#10";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


    }
}
