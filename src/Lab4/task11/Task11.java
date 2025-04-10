package Lab4.task11;

public class Task11 {

    public static int findMax(int... numbers) {

        if (numbers.length == 0) {
            throw new IllegalArgumentException("Має бути принаймні одне число");
        }

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Максимальне число: " + findMax(3, 7, 2, 9, 1));
        System.out.println("Максимальне число: " + findMax(94, 45, 78));
        System.out.println("Максимальне число: " + findMax(-5, -2, -9));
        System.out.println("Максимальне число: " + findMax(42));
    }

}
