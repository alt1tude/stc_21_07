package repeat_String;

public class MainStringIntro {
    public static void main(String[] args) {
        // final-класс - нельзя от это final делать наследование
        // String - содержит поле final char value[]; -> массив символов
        // строка - неизменяема(immutable); -> замена символа в строке, конкатенация - дает всегда новую строку
        String h1 = "Hello";
        String h2 = h1.replace("e", "u");
        System.out.println(h2);
    }
}
