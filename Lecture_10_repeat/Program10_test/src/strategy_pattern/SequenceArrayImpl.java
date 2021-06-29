package strategy_pattern;

public class SequenceArrayImpl implements Sequence {
    private static final int THRESHOLD = 5;
    private int[] sequence;

    private SearchAlgorithm searchAlgorithm;

    public SequenceArrayImpl(int[] sequence) {
        this.sequence = sequence;

        // условие тут - это контекст и в зависимости от контекста, выбирается та или иная стратегия
        if (sequence.length < THRESHOLD) {
            searchAlgorithm = new SearchAlgorithmTrivialImpl(this);
        } else {
            searchAlgorithm = new SearchAlgorithmBinaryImpl(this);
        }
    }

    @Override
    public boolean search(int element) {
        return searchAlgorithm.search(element);
    }

    @Override
    public int[] toArray() {
        return sequence;
    }
}
