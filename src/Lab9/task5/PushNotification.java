package Lab9.task5;

public class PushNotification extends Notification{
    @Override
    public void send(String messege) {
        System.out.println("Sending push notification: " + messege);
    }
}
