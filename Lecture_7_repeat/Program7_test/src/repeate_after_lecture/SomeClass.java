package repeate_after_lecture;

import java.util.Random;

public class SomeClass {
    public static final int CONST = 10;

    public static int a = 50;

    public int b;

    public SomeClass(int b) {
        this.b = b;

//      FIXME: нельзя так делать!
//       a = 50;
    }

    static {
        Random random = new Random();
        a = random.nextInt(100);
    }

    public void someMethod() {
        System.out.println("Some Method");
        System.out.println(a); // есть доступ к полю а
        System.out.println(b); // есть доступ к полю b
    }

    public static void someStaticMethod() {
        System.out.println("Some Static Method");
        System.out.println(a); // есть доступ к полю а
//        System.out.println(b); // НЕТ доступа к полю b
    }

    public static void anotherStaticMethod() {
        someStaticMethod(); // есть доступ к статическому методу
        // someMethod(); // нет доступа к нестатическому методу
    }

}
