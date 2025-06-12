package Lab9.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] myshape = new Shape[3];
        myshape[0] = new Circle(5.3);
        myshape[1] = new Rectangle(4.2, 3.2);
        myshape[2] = new Shape();

        for (Shape shape : myshape){
            System.out.println("Method area: " + shape.area());
        }
    }

}
