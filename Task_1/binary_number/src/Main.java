/**
 * How to convert decimal in binary in java?
 * Use method`s .toBinaryString() or .toString(), one line so easy.
 * NO!
 * CHALLENGE ACCEPTED!(humor)
 **/
public class Main {

    public static void main(String[] args) {
        int number = 12345; // 11 0000 0011 1001
        int nb = number;

        int digit0;
        digit0 = number % 2;
        number = number / 2;

        int digit1;
        digit1 = number % 2;
        number = number / 2;

        int digit2;
        digit2 = number % 2;
        number = number / 2;

        int digit3;
        digit3 = number % 2;
        number = number / 2;

        int digit4;
        digit4 = number % 2;
        number = number / 2;

        int digit5;
        digit5 = number % 2;
        number = number / 2;

        int digit6;
        digit6 = number % 2;
        number = number / 2;

        int digit7;
        digit7 = number % 2;
        number = number / 2;

        int digit8;
        digit8 = number % 2;
        number = number / 2;

        int digit9;
        digit9 = number % 2;
        number = number / 2;

        int digit10;
        digit10 = number % 2;
        number = number / 2;

        int digit11;
        digit11 = number % 2;
        number = number / 2;

        int digit12;
        digit12 = number % 2;
        number = number / 2;

        int digit13;
        digit13 = number % 2;
        number = number / 2;

        int digit14;
        digit14 = number % 2;
        number = number / 2;

        int digit15;
        digit15 = number % 2;
        number = number / 2;

        System.out.printf("%d in binary = %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d \n", nb, digit15, digit14, digit13, digit12, digit11, digit10, digit9, digit8, digit7, digit6, digit5, digit4, digit3, digit2, digit1, digit0);
    }
}
