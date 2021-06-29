package repeate_after_lecture.proxy_hard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsersServiceProxy usersService = new UsersServiceProxy();

        MailService mailService = new MailServiceImpl();
        MailService mockMailService = new MailServiceMockImpl();

//        usersService.setAfter((email, text) -> mailService.sendMessage(email, text));
        usersService.setAfter((email, text) -> mockMailService.sendMessage(email, text));

//        usersService.signUp("test@test.ru", "qwerty123");
//        usersService.signIn("test@test.ru", "qwerty123");
//        usersService.resetPass("admin@admin.ru", "123qwerty123");

        while (true) {
            System.out.println("1. Регистрация");
            System.out.println("2. Вход");
            System.out.println("3. Обновить пароль");

            int command = scanner.nextInt();
            scanner.nextLine();
            String email = scanner.nextLine();
            String password = scanner.nextLine();

            switch (command) {
                case    1: usersService.signUp(email, password); break;
                case    2: usersService.signIn(email, password); break;
                case    3: usersService.resetPass(email, password); break;
            }
        }

    }
}
