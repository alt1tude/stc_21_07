package repeat_wrappers;

import collections_generics.ArrayList;
import collections_generics.List;

public class Main {
    public static void main(String[] args) {
        // Character, Boolean, Double, Short, Long - оберточные типы есть для любого примитива
        // оберточный тип позволяет использовать примитивные значения с обобщениями
        // boxing
        Integer i1 = new Integer(10);

        // unboxing
        int i2 = i1.intValue();
        System.out.println(i2);

        // autoboxing
        Integer i3 = 155;
        int i4 = i3;

        // таким образом оберточные типы позволяют создать объект на основе типа оберточного типа
        // например, тут можно класть сразу числа, они сразу будут преобразованы в значения типа int
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);

    }
}
