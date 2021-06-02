import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] array = {11, 91}; // работает, только для чисел из разряд единиц и десяток
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
        int number = 0;
        for (int i : array) {
            if (i < 10) {
                number = number * 10;
            } else {
                number = number * 100;
            }
            number = number + i;
        }
        System.out.println("This array as a number: " + number);
    }
}
