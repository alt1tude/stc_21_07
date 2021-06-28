package repeate2_after_lecture.observer_hard;

public class CertificateObserver implements TextObserver  {
    private static final String CERTIFICATE_SIGN = "Справка";
    @Override
    public void handleDocument(String document) {
        if (document.contains(CERTIFICATE_SIGN)) {
            System.out.println("Справка отправлена на печать");
        }
    }
}
