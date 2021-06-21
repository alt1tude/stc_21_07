package singleton;

import java.time.LocalTime;

public class Logger {

    private static Logger instance;
    private String name;

    private Logger(String name) {
        this.name = name;
    }

    private Logger() {
    }

    // FIXME: не использовать!
    // ленивая инициализация Singleton(по требования)
//    public static Logger getLogger(String name) {
//        if (instance == null) {
//            instance = new Logger(name);
//        }
//        return instance;
//    }
    static {
        instance = new Logger();
    }

    public static Logger getLogger(String name) {
        if (instance.name == null) {
            instance.name = name;
        }
        return instance;
    }

    public void info(String message) {
        System.out.println(name + " - " + LocalTime.now() + ": " + message);
    }

    public void error(String message) {
        System.err.println(name + " - " + LocalTime.now() + ": " + message);
    }
}
