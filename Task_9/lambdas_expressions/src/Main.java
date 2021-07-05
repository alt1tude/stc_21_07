import java.util.Arrays;

public class Main {

//    static StringProcess test = (string) -> new StringBuilder(string).reverse().toString();
//    String[] strings = new String[]{"Fedya1", "Katya2", "Masha3"};
//    NumberAndStringProcessor numberAndStringProcessor = new NumberAndStringProcessor(strings, ints);
//    String[] process1 = numberAndStringProcessor.process(test);
//    System.out.println(Arrays.toString(process1));

    public static void main(String[] args) {
        String[] strings = new String[]{"Fedya1", "Katya2", "Masha3"};
        int[] ints = new int[]{15, 1025, 12340, 98765};

        NumberAndStringProcessor numberAndStringProcessor = new NumberAndStringProcessor(strings, ints);

        System.out.printf("Original numbers array -> %s\n", Arrays.toString(ints));
        int[] processNumberReverse = numberAndStringProcessor.process((NumberProcess) (number) -> {
            String numberToString = String.valueOf(number);
            String reverseNumber = new StringBuilder(numberToString).reverse().toString();
            return Integer.parseInt(reverseNumber);
        });
        System.out.printf("Reverse numbers array -> %s\n", Arrays.toString(processNumberReverse));

        int[] processNumberRemoveZero = numberAndStringProcessor.process((NumberProcess) (number) -> {
            String numberToString = String.valueOf(number);
            String strWithoutZero = numberToString.replaceAll("0+", "");
            return Integer.parseInt(strWithoutZero);
        });
        System.out.printf("Numbers array without zero -> %s\n", Arrays.toString(processNumberRemoveZero));

        int[] processNumberWithOnlyEven = numberAndStringProcessor.process((NumberProcess) (number) -> {
            if (number % 2 != 0) {
                number = number - 1;
            }
            return number;
        });
        System.out.printf("Numbers array with only even number -> %s\n", Arrays.toString(processNumberWithOnlyEven));

        System.out.println("-----");

        System.out.printf("Original strings array -> %s\n", Arrays.toString(strings));
        String[] processStrReverse = numberAndStringProcessor.process((StringProcess) (string) -> {
            String strReverse = new StringBuilder(string).reverse().toString();
            return strReverse;
        });
        System.out.printf("Reverse strings array -> %s\n", Arrays.toString(processStrReverse));

        String[] processStrRemoveDigits = numberAndStringProcessor.process((StringProcess) (string) -> {
            String strWithoutDigit = string.replaceAll("\\d+", "");
            return strWithoutDigit;
        });
        System.out.printf("Strings array without digits -> %s\n", Arrays.toString(processStrRemoveDigits));

        String[] processStrToUpperCase = numberAndStringProcessor.process((StringProcess) (string) -> {
            String strToUppercase = string.toUpperCase();
            return strToUppercase;
        });
        System.out.printf("Strings array with Upper case -> %s\n", Arrays.toString(processStrToUpperCase));
    }
}
