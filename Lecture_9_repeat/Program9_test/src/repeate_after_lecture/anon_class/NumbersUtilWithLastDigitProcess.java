package repeate_after_lecture.anon_class;

public class NumbersUtilWithLastDigitProcess extends NumbersUtil {

    @Override
    protected int processNumber(int number) {
        return number % 10;
    }
}
