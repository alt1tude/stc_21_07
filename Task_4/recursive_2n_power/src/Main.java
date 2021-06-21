import java.util.Scanner;
public class Main {

    public static int fn2n(double n) {
//        while (n != 1 && n % 2 == 0) {
//            n = n / 2;
//        }
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else {
            System.out.println("--> fn2n(" + n + ")");
            return fn2n(n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for check 2n power: ");
        double nb = scanner.nextDouble();

        if (fn2n(nb) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
