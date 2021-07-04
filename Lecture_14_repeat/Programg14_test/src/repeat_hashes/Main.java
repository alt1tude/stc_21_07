package repeat_hashes;

import java.util.Arrays;

public class Main {

    public static int myHashCode(String string) {
        char array[] = string.toCharArray();
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }

    // hash = sum: code * 31(size - 1 - i), где i - порядковый номер символа в строке
    public static int hashCode(String string) {
        char[] value = string.toCharArray();
        int h = 0;

        for (int i = 0; i < value.length; ++i) {
            h = 31 * h + value[i];
        }

        return h;
    }

    public static void main(String[] args) {
        String name = "Марсель";
        String name1 = "лесраМь";
        System.out.println(name.hashCode());

        System.out.println(myHashCode(name));
        System.out.println("-----");
        System.out.println(myHashCode(name1));

        char[] hello = "Hello".toCharArray();
        for (int i = 0; i < hello.length; ++i) {
            System.out.println((int)hello[i]);
        }

        Human marsel = new Human("Марсель", "Сидиков", 27, 1.85, true);
        Human airat = new Human("Айрат", "Мухутдинов", 22, 1.85, true);

        System.out.println(marsel.hashCode());
        System.out.println(airat.hashCode());
    }
}
