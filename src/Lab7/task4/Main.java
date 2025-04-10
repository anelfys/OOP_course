package Lab7.task4;

public class Main {
    public static void main(String[] args) {
        UserAccount myUserAccount = new UserAccount("anelfys", "123456789");

        if (myUserAccount.login("wrongpass")) {
            System.out.println("Вхід виконано!");
        } else {
            System.out.println("Неправильний пароль!");
        }

        if (myUserAccount.login("123456789")) {
            System.out.println("Вхід виконано!");
        } else {
            System.out.println("Неправильний пароль!");
        }

        if (myUserAccount.changePassword("123456789", "123123123")) {
            System.out.println("Пароль успішно змінений.");
        } else {
            System.out.println("Старий пароль невірний.");
        }

        if (myUserAccount.login("123123123")) {
            System.out.println("Вхід з новим паролем успішний!");
        } else {
            System.out.println("Не вдалося увійти з новим паролем.");
        }

    }
}
