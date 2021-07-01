import java.util.Scanner;

public class MainEquals {

    public static boolean allEquals(Object ... objects) {
        for (int i = 0; i < objects.length - 1; ++i) {
            if (!objects[i].equals(objects[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Human fedya = new Human("Fedya", 27, true);
        Human anotherFedya = new Human("Fedya", 27, true);
        Human anotherFedya1 = new Human("Fedya", 27, true);
        Human anotherFedya2 = new Human("Fedya", 27, true);
//        System.out.println(allEquals("Hello", "Bye", "Hello"));

        // с переопределенным методом equals, которые принимает Human не работает(дает false)
        // потому что в методе allEquals была вызвана реализация стандартная реализация из Object
        System.out.println(allEquals(fedya, anotherFedya, anotherFedya1, anotherFedya2));

    }
}
