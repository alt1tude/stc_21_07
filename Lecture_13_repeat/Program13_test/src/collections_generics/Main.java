package collections_generics;

public class Main {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Fedya");
//        stringList.add("Katya");
//        stringList.add("Sanya");
//        Iterator<String> iterator = stringList.iterator();

        List<Integer> integerList = new ArrayList<>();

        integerList.add(11);
        integerList.add(12);
        integerList.add(15);
        Iterator<Integer> iteratorInt = integerList.iterator();

        while (iteratorInt.hasNext()) {
            System.out.println(iteratorInt.next());
        }

    }
}
