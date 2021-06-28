package repeate2_after_lecture.observer_light;

public class Main {
    public static void main(String[] args) {
        ExitButton button = new ExitButton();

        button.onClick(() -> System.exit(255));
        button.click();
    }
}
