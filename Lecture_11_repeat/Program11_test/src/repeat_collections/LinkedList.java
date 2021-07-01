package repeat_collections;

public class LinkedList implements List {

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // ссылка на начало списка, на 1й эл-т
    private Node first;
    // ссылка на послед. эл-т списка, послед.узел
    private Node last;

    private int size;

    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            Node current = first;

            // отсчитываете index-штук узлов до нужного
            for (int i = 0; i < index; ++i) {
                current = current.next;
            }
            // возвращем его значение
            return current.value;
        }
        System.out.println("Index out of bounds");
        return -1;
    }

    @Override
    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (first == null) {
            add(element);
        } else {
            // если уже есть эл-ты в списке
            // след. узел после нового - это 1й узел списка
            newNode.next = first;
            // новый узел - 1й узел в списке
            first = newNode;
            ++size;
        }
    }

    // работает, но тут обход всего списка постоянно, при большом кол-ве эл-в это плохо
//    @Override
//    public void add(int element) {
//        Node newNode = new Node(element);
//        // если 1го узла нет, то новый узел и есть 1й
//        if (first == null) {
//            first = newNode;
//        } else {
//            // если узлы уже есть, то нужно дойти до последнего, и добавить новый после него
//            Node current = first;
//            // идем по узлам, пока не дошли до последнего
//            // последней узел - это тот узел, у которого нет следующего(логично=))
//            while(current.next != null) {
//                current = current.next;
//            }
//            // делаем новый узел сделующим после последнего
//            current.next = newNode;
//        }
//        ++size;
//    }

    public void add(int element) {
        Node newNode = new Node(element);
        // если в списке еще нет эл-в
        if (first == null) {
            // то 1й и послед. эл-т - это новый
            first = newNode;
            last = newNode;
        } else {
            // послед. эл-т списка ссылается на новый, следовательно новый эл-т встал в конец списка
            last.next = newNode;
            // новый узел стал послед.
            last = newNode;
        }
        ++size;
    }

    @Override
    public boolean contains(int element) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int element) {

    }

    @Override
    public Iterator itetator() {
        return null;
    }

}
