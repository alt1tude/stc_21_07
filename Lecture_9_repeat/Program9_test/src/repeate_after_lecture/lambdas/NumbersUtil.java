package repeate_after_lecture.lambdas;

public class NumbersUtil {
    // макс.кол-во чисел, которые можно обработать
    private static final int MAX_PROCESSED_NUMBERS_COUNT = 10;

    // массив для хранения обработанных чисел
    private int[] processedNumbers;

    // кол-во чисел, которое уже обработали
    private int processedNumbersCount;

    public NumbersUtil() {
        this.processedNumbers = new int[MAX_PROCESSED_NUMBERS_COUNT];
    }

    public void printProcessed() {
        for (int i = 0; i < processedNumbersCount; ++i) {
            System.out.print(processedNumbers[i] + " ");
        }
        System.out.println();
    }

    public void process(int number, ProcessFunction function) {
        if (isHasSize()) {
            int processNumber = function.process(number);
            saveNumber(processNumber);
        } else {
            System.err.println("Кончилось место для обработки чисел");
        }
    }
    public void process(int first, int second, TwoNumbersFunction function) {
        if (isHasSize()) {
            int processNumber = function.process(first, second);
            saveNumber(processNumber);
        } else {
            System.err.println("Кончилось место для обработки чисел");
        }
    }

    protected void saveNumber(int number) {
        processedNumbers[processedNumbersCount] = number;
        ++processedNumbersCount;
    }

    private boolean isHasSize() {
        return processedNumbersCount < MAX_PROCESSED_NUMBERS_COUNT;
    }


}
