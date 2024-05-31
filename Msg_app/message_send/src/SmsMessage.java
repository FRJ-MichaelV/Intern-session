import java.util.Scanner;

public class SmsMessage implements Message{

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        // Code to send SMS
    }
}
