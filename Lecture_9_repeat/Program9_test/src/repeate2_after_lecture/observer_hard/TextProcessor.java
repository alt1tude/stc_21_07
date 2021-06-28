package repeate2_after_lecture.observer_hard;

public interface TextProcessor {
    void addDocument(String document);
    // добавим наблюдателей за док-ми
    void addObserver(TextObserver observer);
    // оповещает всех наблюдателей о каком-либо событии, связанном с док-ми
    void notifyObservers(String document);
}
