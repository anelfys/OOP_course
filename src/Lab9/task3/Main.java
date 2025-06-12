package Lab9.task3;

public class Main {
    public static void main(String[] args) {
        Shape[] myshape = new Shape[3];
        myshape[0] = new Circle();
        myshape[1] = new Square();
        myshape[2] = new Triangle();
        for (Shape shape : myshape){
            shape.draw();
        }
    }
}
