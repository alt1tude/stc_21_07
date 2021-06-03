import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void makeBubbleSort (int[] array) {
        int temp;
        for (int j = 1; j < array.length; ++j) {
            for (int i = 0; i < array.length - 1; ++i) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    public static void makeSwapMinMax (int[] array) {
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

    //только для массива, состоящего из чисел из разряда единиц и десяток
    public static int convertArrayToInt(int[] array) {
        int nb = 0;
        for (int i : array) {
            if (i < 10) {
                nb = nb * 10;
            } else {
                nb = nb * 100;
            }
            nb = nb + i;
        }
        return nb;
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; ++i) {
            System.out.printf("Enter the %d value:\n", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Your entered array: ");
        System.out.println(Arrays.toString(array));

        int resultSum = getSumElementsOfArray(array);
        System.out.println("Sum elements of array = " + resultSum);

        convertArrayMiracle(array);
        double resultAvg = getAvgElementsOfArray(resultSum, n);
        System.out.println("Avg value of array = " + resultAvg);

        makeSwapMinMax(array);
        System.out.print("Array after swap min and max: ");
        System.out.println(Arrays.toString(array));

        makeBubbleSort(array);
        System.out.print("Array after bubble sort: ");
        System.out.println(Arrays.toString(array));

        int arrayToInt = convertArrayToInt(array);
        System.out.println("Array to int = " + arrayToInt);
    }
}
