import java.util.Arrays;
public class Main {
    // работает, только для чисел из разряд единиц и десяток
    public static void main(String[] args) {
        int[] array = {10, 11, 6, 10, 7};
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
        int number = 0;
        int base;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 10) {
                base = 10;
                number = number * base + array[i];
            } else if (array[i] < 100) {
                base = 100;
                number = number * base + array[i];
            }
        }
        System.out.println("This array as a number: " + number);
    }
}
