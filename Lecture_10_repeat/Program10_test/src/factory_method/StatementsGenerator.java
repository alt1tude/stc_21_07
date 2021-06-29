package factory_method;

import java.time.LocalDate;

public class StatementsGenerator implements DocumentsGenerator {
    // реализация фабричного метода, возвращает конкретную реализацию док-та
    @Override
    public Document generate(String text) {
        return new Statement("Заявление от " + LocalDate.now(), text);
    }
}
