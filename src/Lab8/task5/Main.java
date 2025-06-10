package Lab8.task5;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(" Phone");
        phone.turnOn();
        phone.makeCall();

        System.out.println("\n Tablet");
        tablet.turnOn();
        tablet.watchVideo();

        System.out.println("\n SmartPhone");
        smartPhone.turnOn();
        smartPhone.makeCall();
        smartPhone.browseInternet();
    }
}
