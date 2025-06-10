package Lab8.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Аліна", 19, 22500);
        System.out.println("Ім'я: " + employee.getName());
        System.out.println("Вік: " + employee.getAge());
        System.out.println("Зарплатня: " + employee.getSalary());
    }
}
