package Lab7.task3;

public class Main {
    public static void main(String [] args){
        Car myCar = new Car("Module X"," Tesla");
        myCar.accelerate(80);
        myCar.currentSpeed();
        myCar.brake(30);
        myCar.currentSpeed();
        myCar.printStatus();

    }
}