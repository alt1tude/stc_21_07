package strategy_pattern;

public class SearchAlgorithmTrivialImpl implements SearchAlgorithm {

    private Sequence sequence;

    public SearchAlgorithmTrivialImpl(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean search(int element) {
        int[] elements = sequence.toArray();
        for (int i = 0; i < elements.length; ++i) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }
}
