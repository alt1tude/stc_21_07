package repeate_after_lecture.lambdas;

public class LastDigitProcess implements ProcessFunction {
    @Override
    public int process(int number) {
        return number % 10;
    }
}
