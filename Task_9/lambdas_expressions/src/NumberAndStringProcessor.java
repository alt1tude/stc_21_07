import java.util.Arrays;

public class NumberAndStringProcessor {

    private String[] stringsArr;
    private int[] intArr;

    public NumberAndStringProcessor(String[] stringsArr, int[] intArr) {
        this.stringsArr = stringsArr;
        this.intArr = intArr;
    }

    String[] process(StringProcess process) {
        String[] strings = Arrays.copyOf(stringsArr, stringsArr.length);
        for (int i = 0; i < stringsArr.length; ++i) {
            strings[i] = process.process(stringsArr[i]);
        }
        return strings;
    }

    int[] process(NumberProcess process) {
        int[] ints = Arrays.copyOf(intArr, intArr.length);
        for (int i = 0; i < ints.length; ++i) {
            ints[i] = process.process(intArr[i]);
        }
        return ints;
    }

}
