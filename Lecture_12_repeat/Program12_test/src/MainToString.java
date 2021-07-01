import java.util.Scanner;

public class MainToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Human human = new Human("Fedya", 27, true);

        Object a1 = scanner;
        Object a2 = human;

        System.out.println(human);

    }
}
