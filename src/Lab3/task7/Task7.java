package Lab3.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

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

            // Сортування масиву
            Arrays.sort(array);

            // Виведення відсортованого масиву
            System.out.println("\nВідсортований масив за зростанням: ");
            System.out.println(Arrays.toString(array));

            scanner.close();
        }
    }

