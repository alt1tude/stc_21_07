package repeate_after_lecture.proxy_hard;

public class MailServiceImpl implements MailService {

    @Override
    public void sendMessage(String email, String text) {
        initializeSmtp();
        System.out.println("Сообщение <" + text + "> отправлено на " + email);
    }

    private void initializeSmtp() {
        // типо подключение к почте
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}
