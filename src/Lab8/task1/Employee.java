package Lab8.task1;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
