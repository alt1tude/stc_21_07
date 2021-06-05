import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the spiral array: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns of the spiral array: ");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        int indexRow = 0;
        int lastIndexRow = array.length - 1;
        int indexCol = 0;
        int lastIndexCol = array[indexRow].length - 1;
        while (indexRow <= lastIndexRow && indexCol <= lastIndexCol) {
            for (int i = indexCol; i <= lastIndexCol; ++i) {
                System.out.printf("Enter the [%d][%d] value: ", indexRow, i);
                array[indexRow][i] = scanner.nextInt();
            }
            ++indexRow; // 0->1
            for (int i = indexRow; i <= lastIndexRow; ++i) {
                System.out.printf("Enter the [%d][%d] value: ", i, lastIndexCol);
                array[i][lastIndexCol] = scanner.nextInt();
            }
            --lastIndexCol;
            if (indexRow <= lastIndexRow) {
                for (int i = lastIndexCol; i >= indexCol; --i) {
                    System.out.printf("Enter the [%d][%d] value: ", lastIndexRow, i);
                    array[lastIndexRow][i] = scanner.nextInt();
                }
                --lastIndexRow; // 2->1 example 3x3
            }
            for (int i = lastIndexRow; i >= indexRow; --i) {
                System.out.printf("Enter the [%d][%d] value: ", i, indexCol);
                array[i][indexCol] = scanner.nextInt();
            }
            ++indexCol;
        }
        System.out.println("Your entered two dimensional spiral array: ");
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
