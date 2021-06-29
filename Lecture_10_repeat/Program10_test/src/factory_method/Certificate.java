package factory_method;

public class Certificate implements Document {

    private String text;
    private String title;

    public Certificate(String text, String title) {
        this.text = text;
        this.title = title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
