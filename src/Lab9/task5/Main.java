package Lab9.task5;

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification();
        notifications[1] = new PushNotification();
        notifications[2] = new SMSNotification();

       for (Notification notification : notifications){
           notification.send("Hello, user!");
        }
    }
}
