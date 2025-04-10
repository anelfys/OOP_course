package Lab4.task6;

public class Task6 {
    public static void printNumber(){

        int num = 10;
        System.out.println("Значення змінної: " + num);
    }
    public static void main(String[] args){

        printNumber();

        /* Це спроба вивести локальну змінну num
        //System.out.println(num); - Викликає помилку
         Змінна num оголошена всередині методу printNumber(),
         тому вона локальна існує тільки під час виконання цього методу.
         Зовні (наприклад, у main()) вона не видна і не існує.*/
    }
}

