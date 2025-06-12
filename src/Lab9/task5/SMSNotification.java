package Lab9.task5;

public class SMSNotification extends Notification{
    @Override
    public void send(String messege) {
        System.out.println("Sending SMS: " + messege);
    }
}
