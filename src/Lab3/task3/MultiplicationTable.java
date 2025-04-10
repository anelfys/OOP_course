package Lab3.task3;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 7;


        System.out.println("Таблиця множення для числа 7 (цикл for):");
        for (int i = 1; i <= 10; i++)
            System.out.println(num + "*" + i + "=" + (num * i));


         System.out.println("\nТаблиця множення для числа 7 (цикл while):");
    int i = 1;
    while (i <= 10) {
        System.out.println(num + "*" + i + "=" + (num * i));
        i++;
    }

        System.out.println("\nТаблиця множення для числа 7 (цикл do-while):");
    i = 1;
    do {
        System.out.println(num + "*" + i + "=" + (num * i));
        i++;
    }while (i <= 10);
    }

}

