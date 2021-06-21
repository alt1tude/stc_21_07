package static_nested;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        table.put("Fedya", 27);
        table.put("Katya", 25);
        table.put("Evgen", 30);
        table.put("Elena", 23);

//        Table.TableEntry tableEntry = new Table.TableEntry("Julia", 31);

        Table.Iterator iterator = table.new Iterator();
        Table.TableEntry element = iterator.next();

        while(element != null) {
            System.out.println(element.key + " " + element.value);
            element = iterator.next();
        }

        Table table1 = new Table();
        table1.put("Audi", 4);
        table1.put("BMW", 5);

        Table.Iterator anotherIterator = table1.new Iterator();
        element = anotherIterator.next();

        while(element != null) {
            System.out.println(element.key + " " + element.value);
            element = anotherIterator.next();
        }
    }
}
