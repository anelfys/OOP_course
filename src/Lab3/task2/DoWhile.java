package Lab3.task2;

import java.util.Scanner;
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int guess;
            int attempts = 0;
            int min;
            int max;

            System.out.println("Гра Відгадай число!");
            System.out.print("Введіть мінімальне число: ");
            min = scanner.nextInt();
            System.out.print("Введіть максимальне число: ");
            max = scanner.nextInt();

            int randomNumber = random.nextInt(min, max);
            System.out.printf("Вгадай число у проміжку від %d до %d, ", min, max);

            do {
                System.out.print("Введіть число: ");
                guess = scanner.nextInt();
                attempts++;
                if (guess < randomNumber) {
                    System.out.println("Спробуйте більше число.");
                } else if (guess > randomNumber) {
                    System.out.println("Спробуйте менше число.");
                } else {
                    System.out.println("Ви вгадали загадане число.");
                    System.out.println("Ви використали " + attempts + " спроб(и).");
                }
            } while (guess != randomNumber);

            System.out.println("Завершення програми.");
            scanner.close();
        }
    }

