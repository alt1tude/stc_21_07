package repeate_after_lecture.proxy_hard;

import java.time.LocalDateTime;

public class UsersServiceProxy extends UsersService {
   private AfterForUsersService after;

    public void setAfter(AfterForUsersService after) {
        this.after = after;
    }

    @Override
    public void signUp(String email, String password) {
        super.signUp(email, password);

        executeAfter(email, "Вы зарегистрированы" );
    }

    @Override
    public void signIn(String email, String password) {
        super.signIn(email, password);

        executeAfter(email, "Вы вошли в систему " + LocalDateTime.now());
    }

    @Override
    public void resetPass(String email, String password) {
        super.resetPass(email, password);

        executeAfter(email, "Заявку на смену пароля отправлена " + LocalDateTime.now());
    }

    private void executeAfter(String email, String password) {
        if(after != null) {
            after.execute(email, password);
        }
    }
}
