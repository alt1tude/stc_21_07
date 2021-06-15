import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void makeBubbleSort(int[] array) {
        int temp;
        for (int j = 1; j < array.length; ++j) {
            for (int i = 0; i < array.length - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static int[] copyOfArray(int[] array) {
//      int[] newCopyArray = Arrays.copyOf(array, array.length);
        int[] newCopyArray = new int[array.length];
        System.arraycopy(array, 0, newCopyArray, 0,
                Math.min(array.length, newCopyArray.length));
        return newCopyArray;
    }

    public static void makeSwapMinMax(int[] array) {
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
        int temp = array[positionOfMin];
        array[positionOfMin] = array[positionOfMax];
        array[positionOfMax] = temp;
    }

    public static double getAvgElementsOfArray(int sum, double number) {
        return sum / number;
    }

    public static void convertArrayMiracle(int[] array) {
        int temp;
        int left = 0;
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

    public static int getSumElementsOfArray(int[] array) {
        int sumElements = 0;
        for (int i : array) {
            sumElements = sumElements + i;
        }
        return sumElements;
    }

    public static int convertArrayToInt(int[] array) {
        int nb = 0;
        int multiplier = 1;
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] != 0) {
                for (int decomposeNb = array[i]; decomposeNb != 0; decomposeNb /= 10) {
                    int remainder = decomposeNb % 10;
                    if (remainder != 0) {
                        nb = nb + remainder * multiplier;
                    }
                    multiplier *= 10;
                }
            } else {
                multiplier *= 10;
            }
        }
        return nb;
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Enter the %d value:\n", i);
            array[i] = scanner.nextInt();
        }
        int[] newCopyArray = copyOfArray(array);

        System.out.print("Your entered array: ");
        System.out.println(Arrays.toString(array));

        int resultSum = getSumElementsOfArray(array);
        System.out.println("Sum elements of array = " + resultSum);

        convertArrayMiracle(array);
        double resultAvg = getAvgElementsOfArray(resultSum, n);
        System.out.println("Avg value of array = " + resultAvg);

        int arrayToInt = convertArrayToInt(newCopyArray);
        System.out.println("Original array to int = " + arrayToInt);

        makeSwapMinMax(newCopyArray);
        System.out.print("Original array after swap min and max: ");
        System.out.println(Arrays.toString(newCopyArray));

        makeBubbleSort(array);
        System.out.print("Array after bubble sort: ");
        System.out.println(Arrays.toString(array));
    }
}
