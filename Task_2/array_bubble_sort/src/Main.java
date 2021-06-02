import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 7};
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
        int temp;
        for (int j = 1; j < array.length; ++j) {
            for (int i = 0; i < array.length - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    System.out.printf("Change %d and %d \n", array[i], array[i + 1]);
                }
            }
        }
        System.out.print("Array now: ");
        System.out.println(Arrays.toString(array));
    }
}
