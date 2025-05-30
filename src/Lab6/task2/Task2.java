package Lab6.task2;
// Процедурний Метод
public class Task2 {
    static String brand = "Ford";
    static String model = "Mustang";
    static int speed = 30;

    public static void acceleration (int increment) {
        speed += increment;
    }

    public static void printInfo () {
        System.out.println("Автівка: " + brand + " " + model);
        System.out.println("Поточна швидкість автівки: " + speed + " км/год");
    }
    public static void main(String[] args){
        printInfo();
        acceleration(60);
        printInfo ();
    }
}

