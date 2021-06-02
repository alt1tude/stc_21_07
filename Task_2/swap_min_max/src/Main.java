import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; ++i) {
            System.out.printf("Enter the %d value:\n", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Your entered array: ");
        System.out.println(Arrays.toString(array));
        int min = array[0], max = array[0];
        int positionOfMin = 0, positionOfMax = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
                positionOfMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                positionOfMax = i;
            }
        }
        System.out.println("Min value in array: " + min);
        System.out.println("Position of min value: " + positionOfMin);
        System.out.println("Max value in array: " + max);
        System.out.println("Position of max value: " + positionOfMax);
        int temp = array[positionOfMin];
        array[positionOfMin] = array[positionOfMax];
        array[positionOfMax] = temp;
        System.out.print("Array after swap min and max: ");
        System.out.println(Arrays.toString(array));
    }
}
