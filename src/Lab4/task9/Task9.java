package Lab4.task9;

public class Task9 {

    public static int sum(int... numbers){

        int value = 0;
        for (int num : numbers) {
            value += num;
        }
        return value;
    }
public static void main(String[] args){

        System.out.println("Сума 1 числа: " + sum(6));
        System.out.println("Сума 5 чисел: " + sum(6,5,7,1,3));
        System.out.println("Сума 8 чисел: " + sum(6,9,3,2,1,5,8));
}

}

