package Lab9.task1;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println("Сума двох цілих чисел: " + myCalculator.add(15, 20));
        System.out.println("Сума двох чисел з плаваючою крапкою: " + myCalculator.add(28.2, 20.5));
        System.out.println("Сума трьох чисел: " + myCalculator.add(25, 20,13));
    }
}

