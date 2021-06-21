package repeate_after_lecture;

public class MainStaticMethod {
    public static void main(String[] args) {
        SomeClass object = new SomeClass(10);

        object.someMethod();

        SomeClass.someStaticMethod();
    }
}
