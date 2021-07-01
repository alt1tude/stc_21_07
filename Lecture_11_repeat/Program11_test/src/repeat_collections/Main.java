package repeat_collections;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();

        Random random = new Random();

        for (int i = 0; i < 15; ++i) {
            list.add(random.nextInt(100));
        }

        list.addFirst(777);

        Iterator iterator = list.itetator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
