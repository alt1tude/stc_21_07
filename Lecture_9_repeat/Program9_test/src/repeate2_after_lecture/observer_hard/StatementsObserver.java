package repeate2_after_lecture.observer_hard;

// перехватывает заявления
public class StatementsObserver implements TextObserver {
    private static final String STATEMENT_SIGN = "Заявление";
    @Override
    public void handleDocument(String document) {
        if(document.contains(STATEMENT_SIGN)) {
            System.out.println("Заявление направлено в соответ. отдел");
        }
    }
}
