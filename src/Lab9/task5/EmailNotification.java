package Lab9.task5;

public class EmailNotification extends Notification{
    @Override
    public void send(String messege) {
        System.out.println("Sending email: " + messege);
    }
}
