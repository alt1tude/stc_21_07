package factory_method;

public class DocumentsPrinter {
    private DocumentsGenerator documentsGenerator;

    public void setDocumentsGenerator(DocumentsGenerator documentsGenerator) {
        this.documentsGenerator = documentsGenerator;
    }

    public void printDocument(String text) {
        Document document = documentsGenerator.generate(text);
        System.out.println("-----" + document.getTitle() + "-----");
        System.out.println(document.getText());
    }
}
