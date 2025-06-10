package Lab8.task2;

public class Vehicle {
    protected int speed;
    public Vehicle(){
        this.speed = 30;
    }
    public void showSpeed(){
        System.out.println("Поточна швидкість: " + speed + "км/год");
    }
}
