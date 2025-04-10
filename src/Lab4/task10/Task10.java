package Lab4.task10;

public class Task10 {

    public static void printNumbers(String message, int... numbers) {

        System.out.print(message + " ");

        for (int num : numbers) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        printNumbers("1 елемент:", 6);
        printNumbers("3 елементи:", 13, 24, 36);
        printNumbers("5 елементів:", 1, 2, 3, 4, 5);
        printNumbers("Без чисел:");
    }
}

