package Lab8.task4;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double area(){
        return width * height;
    }
}