package repeat_collections;

public class Main1 {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(10);
        list.add(15);
        list.add(11);
        list.add(17);
        list.add(12);

//       list.addFirst(777);
//       list.addFirst(999);

        System.out.println(list.get(0)); // 10
        System.out.println(list.get(3)); // 17
    }
}
