package repeat_primitive_map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // array[3] = 6, "3" - ключ, "6" - значение(аналогия)
        map.put("Марсель", 27);
        map.put("Айрат", 22);
        map.put("Максим", 22);
        map.put("Даниил", 21);
        map.put("Марсель", 28);
        map.put("Ильгам", 23);
        map.put("Салават", 24);
        map.put("Алия", 20);
        map.put("Виктор", 24);

        // int v = array[3], 3 = ключ, v = значение сохраняем
        Integer i15 = map.get("Fedya"); // int -> Integer не будет ошибки
        // оберточные типы допускают значение null

        int i1 = map.get("Марсель"); // i1 -> 27
        int i2 = map.get("Айрат"); // i2 -> 22
        int i3 = map.get("Максим"); // i3 -> 22
        int i4 = map.get("Даниил"); // i4 -> 21
        int i5 = map.get("Ильгам"); // i5 -> 23
        int i6 = map.get("Салават"); // i6 -> 24
        int i7 = map.get("Алия"); // i7 -> 20
        int i8 = map.get("Виктор"); // i8 -> 24

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

    }
}
