package repeate2_after_lecture.observer_hard;

public class TextProcessorImpl implements TextProcessor {
    private static final int MAX_OBSERVERS_COUNT = 5;

    private TextObserver[] observers;
    private int observersCount;

    public TextProcessorImpl() {
        this.observers = new TextObserver[MAX_OBSERVERS_COUNT];
    }


    @Override
    public void addDocument(String document) {
        System.out.println("Получен док-т: " + document);
        // оповещаем всех обработчиков, что пришел док-т
        notifyObservers(document);
    }

    @Override
    public void addObserver(TextObserver observer) {
        if (observersCount < MAX_OBSERVERS_COUNT) {
            observers[observersCount] = observer;
           ++observersCount;
        } else {
            System.err.println("Превышено кол-во обработчиков");
        }

    }

    @Override
    public void notifyObservers(String document) {
        for (int i = 0; i < observersCount; ++i) {
            observers[i].handleDocument(document);
        }
    }
}
