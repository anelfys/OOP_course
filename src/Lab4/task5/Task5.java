package Lab4.task5;

public class Task5 {
    public static void calculateArea(double radius){

        System.out.println("Площа кола: " + (radius * radius));
    }

    public static void calculateArea(double length, double width){

        System.out.println("Площа прямокутника: " + (length * width));
    }

    public static void main(String[] args){
        calculateArea(4);
        calculateArea(5);
        calculateArea(7);
        calculateArea(5,9);
        calculateArea(3,6);
        calculateArea(7,9);
    }
}
