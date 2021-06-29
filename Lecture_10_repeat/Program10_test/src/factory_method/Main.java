package factory_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentsPrinter printer = new DocumentsPrinter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - нужна справка");
        System.out.println("2 - нужно заявление");

        int type = scanner.nextInt();
        scanner.nextLine();
        if (type == 1) {
            printer.setDocumentsGenerator(new CertificatesGenerator());
        } else {
            printer.setDocumentsGenerator(new StatementsGenerator());
        }

        String text = scanner.nextLine();
        printer.printDocument(text);
    }
}
