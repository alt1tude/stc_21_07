public class Main {

    public static void main(String[] args) {
        int number = 12345;
        int sumNumbers = 0;
        sumNumbers = number % 10; // 5
        number = number / 10;
        sumNumbers = sumNumbers + number % 10; // 9
        number = number / 10;
        sumNumbers = sumNumbers + number % 10; // 12
        number = number / 10;
        sumNumbers = sumNumbers + number % 10; // 14
        number = number / 10;
        sumNumbers = sumNumbers + number % 10; // 15
        System.out.println(sumNumbers);
    }
}
