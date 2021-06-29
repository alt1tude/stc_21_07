package factory_method;

public interface DocumentsGenerator {
    // фабричный метод, возвращает Document
    Document generate(String text);
}
