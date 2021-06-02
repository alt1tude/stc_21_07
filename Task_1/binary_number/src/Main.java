/**
 * How to convert decimal in binary in java?
 * Use method`s .toBinaryString() or .toString(), one line so easy.
 * NO!
 * CHALLENGE ACCEPTED
 **/
public class Main {

    public static void main(String[] args) {
        int number = 12345; // 11 0000 0011 1001
        int nb = number;
        int digit0 = 0;
        digit0 = number % 2; // 9 -> 1
        number = number / 2;
        int digit1 = 0;
        digit1 = number % 2; // 4 -> 0
        number = number / 2;
        int digit2 = 0;
        digit2 = number % 2; // 2 -> 0
        number = number / 2; // 2 / 2 = 1
        int digit3 = 0;
        digit3 = number % 2; // 1 % 2 = 1
        number = number / 2; // 1 / 2 = 0 т.к тип int
        int digit4 = 0;
        digit4 = number % 2; // 0
        number = number / 2;
        int digit5 = 0;
        digit5 = number % 2; // 0
        number = number / 2;
        int digit6 = 0;
        digit6 = number % 2; //
        number = number / 2;
        int digit7 = 0;
        digit7 = number % 2; //
        number = number / 2;
        int digit8 = 0;
        digit8 = number % 2; //
        number = number / 2;
        int digit9 = 0;
        digit9 = number % 2; //
        number = number / 2;
        int digit10 = 0;
        digit10 = number % 2; //
        number = number / 2;
        int digit11 = 0;
        digit11 = number % 2; //
        number = number / 2;
        int digit12 = 0;
        digit12 = number % 2; //
        number = number / 2;
        int digit13 = 0;
        digit13 = number % 2; //
        number = number / 2;
        int digit14 = 0;
        digit14 = number % 2; //
        number = number / 2;
        int digit15 = 0;
        digit15 = number % 2; //
        number = number / 2;
        int digit16 = 0;
        digit16 = number % 2; //
        number = number / 2;
        int digit17 = 0;
        digit17 = number % 2; //
        number = number / 2;
        int digit18 = 0;
        digit18 = number % 2; //
        number = number / 2;
        int digit19 = 0;
        digit19 = number % 2; //
        number = number / 2;
        int digit20 = 0;
        digit20 = number % 2; //
        number = number / 2;
        int digit21 = 0;
        digit21 = number % 2; //
        number = number / 2;
        int digit22 = 0;
        digit22 = number % 2; //
        number = number / 2;
        int digit23 = 0;
        digit23 = number % 2; //
        number = number / 2;
        int digit24 = 0;
        digit24 = number % 2; //
        number = number / 2;
        int digit25 = 0;
        digit25 = number % 2; //
        number = number / 2;
        int digit26 = 0;
        digit26 = number % 2; //
        number = number / 2;
        int digit27 = 0;
        digit27 = number % 2; //
        number = number / 2;
        int digit28 = 0;
        digit28 = number % 2; //
        number = number / 2;
        int digit29 = 0;
        digit29 = number % 2; //
        number = number / 2;
        int digit30 = 0;
        digit30 = number % 2; //
        number = number / 2;
        int digit31 = 0;
        digit31 = number % 2; //
        number = number / 2;
        System.out.printf("%d in binary = %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d \n", nb, digit31, digit30, digit29, digit28, digit27, digit26, digit25, digit24, digit23, digit22, digit21, digit20, digit19, digit18, digit17, digit16, digit15, digit14, digit13, digit12, digit11, digit10, digit9, digit8, digit7, digit6, digit5, digit4, digit3, digit2, digit1, digit0);
    }
}
