package Lab6.task2;
// ООП Метод
public class Main {
    public static void main(String[]args){
        Car myCar = new Car("Dodge", "Challenger");
        myCar.printInfo();
        myCar.acceleration(40);
        myCar.printInfo();
    }
}
