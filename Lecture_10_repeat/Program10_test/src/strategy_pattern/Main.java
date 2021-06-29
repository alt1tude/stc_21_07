package strategy_pattern;

public class Main {
    public static void main(String[] args) {

        int elements[] = {7, 5, 6, 4, -3, 10, 5};
        Sequence sequence = new SequenceArrayImpl(elements);

        System.out.println(sequence.search(4));
        System.out.println(sequence.search(5));
        System.out.println(sequence.search(6));
        System.out.println(sequence.search(7));
        System.out.println(sequence.search(1));

    }
}
