package repeate_after_lecture.anon_class;

public class NumbersUtilWithEvenProcess extends NumbersUtil {
    @Override
    protected int processNumber(int number) {
        return number % 2;
    }
}
