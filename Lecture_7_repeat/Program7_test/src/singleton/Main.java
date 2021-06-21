package singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Logger logger = new Logger("Logger1");
//        Logger anotherLogger = new Logger("Logger2");

        Logger logger = Logger.getLogger("Logger1");
        Logger anotherLogger = Logger.getLogger("Logger2");


        logger.info("Программа запущена");

        Scanner scanner = new Scanner(System.in);
        anotherLogger.info("Создан Scanner для чтения инфо");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        logger.info("Считано 2 числа");

        if (b == 0) {
            logger.error("Попытка деления на 0");
            logger.info("Программа остановлена");
            return;
        }

        int result  = a / b;
        logger.info("Получен результат работы");
        System.out.println(result);
        anotherLogger.info("Программа остановлена");
    }
}
