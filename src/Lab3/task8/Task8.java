package Lab3.task8;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }

        System.out.println("Масив випадкових чисел:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nЯке число ви шукаєте: ");
        int value = scanner.nextInt();

        boolean found = false;
        for (int number : array) {
            if (number == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Ваше число " + value + " знайдено!");
        } else {
            System.out.println("Ваше число " + value + " не знайдено!");
        }


    }
}