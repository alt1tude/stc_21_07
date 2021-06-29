package factory_method;

import java.time.LocalDate;

public class CertificatesGenerator implements DocumentsGenerator {
    @Override
    public Document generate(String text) {
        return new Certificate("Справка от " + LocalDate.now(), text);
    }
}
