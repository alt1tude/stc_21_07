package repeat_String;

public class MainStringEquals {
    public static void main(String[] args) {
        // java все литеральные (т.е. объявленные прям в коде) строк помещает
        // в так называемый String Pool
        String s1 = "Hello";
        String s2 = "Hello";
        // явно создали другую строку, т.е выделили для нее отдельный объект - строка вне String Pool`а
        String s3 = new String("Hello");


        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        // про метод intern(), который может принудительно положить ее String Pool и вернуть ссылку
        System.out.println(s3.intern() == s1);

    }

}
