package repeate_after_lecture.proxy_hard;

public class UsersService {
    public void signUp(String email, String password) {
        // сохранение инфо в БД
        System.out.println("Регистрация прошла успешно");
    }

    public void signIn(String email, String password) {
        // поиск юзера в БД, проверка пароля
        System.out.println("Вход прошел успешно");
    }

    public void resetPass (String email, String password) {
        // сохранение инфо в БД
        System.out.println("Заявка на смену пароля отправлена");
    }
}
