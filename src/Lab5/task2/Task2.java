/*package Lab5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do{
            System.out.println("Меню");
            System.out.println("1. Вивести поточний баланс");
            System.out.println("2. Внести кошти на рахунок");
            System.out.println("3. Зняти кошти з рахунку");
            System.out.println("4. Вийти");
            System.out.println("Оберіть дію: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Банківська програма завершена!");
                    break;
            }
        } while (choice !=4 );


    }
}*/
