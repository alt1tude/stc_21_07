package repeate_after_lecture.proxy_hard;

public class MailServiceMockImpl implements MailService {
    @Override
    public void sendMessage(String email, String text) {
        System.out.println("Вызов фейкового сервиса для отправки сообщений");
    }
}
