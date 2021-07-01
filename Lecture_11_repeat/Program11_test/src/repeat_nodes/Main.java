package repeat_nodes;

public class Main {
    public static void main(String[] args) {

        Node a = new Node(7);
        Node b = new Node(10);
        Node c = new Node(8);
        Node d = new Node(15);
        Node e = new Node(-20);
        Node f = new Node(11);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);

        Node current = a;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }
}
