package repeat_wrappers;

public class Main2 {
    public static void main(String[] args) {
        // -128 .. 127 -> true, кэширование для этих чисел будет использоваться один и тот же объект
        Integer i1 = 119;
        Integer i2 = 119;
        System.out.println(i1 == i2);
    }
}
