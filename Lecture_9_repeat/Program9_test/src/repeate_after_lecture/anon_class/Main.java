package repeate_after_lecture.anon_class;

public class Main {

    public static void main(String[] args) {
        NumbersUtil evenProcess = new NumbersUtilWithEvenProcess();

        evenProcess.process(10);
        evenProcess.process(11);
        evenProcess.process(12);
        evenProcess.process(13);
        evenProcess.process(14);
        evenProcess.process(15);

        evenProcess.printProcessed();

        NumbersUtil lastDigitProcess = new NumbersUtilWithLastDigitProcess();

        lastDigitProcess.process(10);
        lastDigitProcess.process(11);
        lastDigitProcess.process(12);
        lastDigitProcess.process(13);
        lastDigitProcess.process(14);
        lastDigitProcess.process(15);

        lastDigitProcess.printProcessed();

        // локальный(анонимный) класс

        NumbersUtil digitsSum = new NumbersUtil() {
            @Override
            protected int processNumber(int number) {
                int result = 0;
                while (number != 0) {
                    result += number % 10;
                    number = number / 10;
                }
                return result;
            }
        };

        digitsSum.process(12345);
        digitsSum.process(777);
        digitsSum.process(888);
        digitsSum.printProcessed();
    }
}
