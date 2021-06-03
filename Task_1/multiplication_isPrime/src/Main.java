import java.util.Scanner;

/**
 * 119 = 1+1+9 = 11(prime)
 * 33542 = 3+3+5+4+2 = 17(prime)
 * 99 = 9+9 = 18(no prime)
 * 9911 = 9+9+1+1 = 20(no prime)
 * 0
 * <p>
 * 119*33542 = 3 991498
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");

        int currentNumber = scanner.nextInt();
        int multPrime = 1;
        while (currentNumber != 0) {
            int nb = currentNumber;
            int sumNumbers = 0;
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                sumNumbers = sumNumbers + lastDigit;
                currentNumber = currentNumber / 10;
            }
            System.out.printf("Sum of numbers = %d", sumNumbers);
            int i = 0;
            int countDivisor = 0;
            while (i <= sumNumbers) {
                ++i;
                if (sumNumbers % i == 0) {
                    ++countDivisor;
                } else {
                    continue;
                }
                if (countDivisor == 3) break;
            }
            System.out.printf("(%sprime)\n", countDivisor == 2 ? "" : "no ");
            if (countDivisor == 2) {
                multPrime *= nb;
            }
            currentNumber = scanner.nextInt();
        }
        System.out.printf("The multiplication of numbers, where sum of digits is prime number = %d\n", multPrime);
    }
}
