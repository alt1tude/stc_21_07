import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Enter the %d value:\n", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Your entered array: ");
        System.out.println(Arrays.toString(array));
        int temp, left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        // int j = 1;
        for (int i = 0; i < middle; ++i) {
            temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
            // ++j;
        }
        System.out.print("My mirror array after work: ");
        System.out.println(Arrays.toString(array));
    }
}
