package Lab10.task5;

public class Main {
    public static void main(String[] args) {

    WasherDryer washerDryer = new WasherDryer("Samsung");
    washerDryer.turnOn();
    washerDryer.wash();
    washerDryer.dry();

    Appliance appliance = washerDryer;
    Washable washable = washerDryer;
    Dryable dryable = washerDryer;

        System.out.println("Демонстрація поліморфізму: ");

        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
