package repeate_after_lecture.lambdas;

public class Main2 {
    public static void main(String[] args) {
        NumbersUtil util = new NumbersUtil();

        util.process(10, 15, (a, b) -> a + b);
        util.process(7, 2, (a, b) -> a * b);
        util.process(777, number -> number % 100);

        util.process(125, number -> {
            int result = 0;
            while (number != 0) {
                result += number % 10;
                number = number / 10;
            }
            return result;
        });

        util.printProcessed();
    }
}
