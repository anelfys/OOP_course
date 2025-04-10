package Lab3.task10;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("\nДублікатів не знайдено.");
        } else {
            System.out.println("\nЗнайдені дублікати: " + duplicates);
        }
        scanner.close();

    }
}