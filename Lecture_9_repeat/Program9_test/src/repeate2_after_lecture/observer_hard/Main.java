package repeate2_after_lecture.observer_hard;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TextProcessor textProcessor = new TextProcessorImpl();
        textProcessor.addObserver(new CertificateObserver());
        textProcessor.addObserver(new StatementsObserver());

        textProcessor.addObserver(document -> {
            System.out.println("Документ <" + document + "> был получне в " + LocalDateTime.now().toString());
        });

        //для тестов
        while (true) {
            String document = scanner.nextLine();
            textProcessor.addDocument(document);
        }
    }
}
