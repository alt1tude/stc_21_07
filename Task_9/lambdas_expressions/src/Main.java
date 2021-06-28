import java.util.Arrays;

public class Main {

//    static StringProcess reverseString = (string) -> new StringBuilder(string).reverse().toString();

    public static void main(String[] args) {
        String[] strings = new String[]{"Fedya", "Katya", "Masha"};
        int[] ints = new int[]{};

        NumberAndStringProcessor numberAndStringProcessor = new NumberAndStringProcessor(strings, ints);
        System.out.println(Arrays.toString(strings));

        String[] processS1 = numberAndStringProcessor.process((StringProcess) (string) -> {
            String reverseNumber = new StringBuilder(string).reverse().toString();
            return reverseNumber;
        });

        System.out.println(Arrays.toString(processS1));



    }
}
