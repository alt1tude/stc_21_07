package repeate_after_lecture;

public class MainStaticField {

    public static void main(String[] args) {
        System.out.println(SomeClass.a);
        SomeClass obj1 = new SomeClass(1);
        obj1.a = 30;
        SomeClass obj2 = new SomeClass(5);
        obj2.a = 40;
        SomeClass obj3 = new SomeClass(10);
        obj3.a = 50;

        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(obj3.b);

        SomeClass.a = 400; //

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj3.a);
    }
}
