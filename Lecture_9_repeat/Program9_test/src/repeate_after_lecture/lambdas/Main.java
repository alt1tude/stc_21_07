package repeate_after_lecture.lambdas;

public class Main {
    public static void main(String[] args) {
        NumbersUtil numbersUtil = new NumbersUtil();

//        ProcessFunction processFunction = new LastDigitProcess();

        ProcessFunction processFunction = new ProcessFunction() {
            @Override
            public int process(int number) {
                return number % 10;
            }
        };

        ProcessFunction sumDigitsFunction = number -> {
            int result = 0;
            while (number != 0) {
                result += number % 10;
                number = number / 10;
            }
            return result;
        };

        numbersUtil.process(12345, sumDigitsFunction);
        numbersUtil.process(1234, sumDigitsFunction);
        numbersUtil.process(123, sumDigitsFunction);
        numbersUtil.printProcessed();


    }
}
