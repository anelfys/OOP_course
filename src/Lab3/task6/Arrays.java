package Lab3.task6;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Введіть розмір масиву: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1;
            }

            System.out.println("Масив випадкових чисел:");
            for (int num : array) {
                System.out.print(num + " ");
            }

            int min = array[0];
            int max = array[0];
            int sum = 0;
            int evenNumber = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) min = array[i];
                if (array[i] > max) max = array[i];
                sum += array[i];
                if (array[i] % 2 == 0) evenNumber++;
            }
            double averageValue = (double) sum / size;

            System.out.println("\nМінімальне число: " + min );
            System.out.println("Максимальне число: " + max);
            System.out.println("Середнє значення: " + averageValue);
            System.out.println("Парні числа: " + evenNumber);

        }

    }

