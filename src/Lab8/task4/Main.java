package Lab8.task4;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Площа куга: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());

    }
}