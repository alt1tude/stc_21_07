package collections_generics;

public class ArrayList<D> implements List<D> {
    private static final int DEFAULT_SIZE = 10;

    private D[] elements;

    private int size;

    public ArrayList() {
        this.elements = (D[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    @Override
    public D get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            System.err.println("Out of bounds");
            return null;
        }

    }

    @Override
    public void addFirst(D element) {
        if (size == elements.length) {
            resize();
        }
        // делаем сдвинг эл-в массива на 1 вправо
        for (int i = size + 1; i > 0; --i) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[0] = element;
        ++size;
    }

    @Override
    public void add(D element) {
        // если кол-во эл-в стало равно "размеру"
        if (size == elements.length) {
            resize();
        }
        this.elements[size] = element;
        ++size;
    }

    private void resize() {
        // создаем новый массив с так называемой "динамической длинной"
        // каждое "полное" заполнение приводит к созданию нового, в 1.5 раза больше массива(оптимальный вариант)
        D[] newElements = (D[]) new Object[elements.length + elements.length / 2];

        // копируем данные из массива с эл-ми в новый, большего по размеру
        for (int i = 0; i < size; ++i) {
            newElements[i] = elements[i];
        }
        // изменяем ссылку на массив с эл-ми
        this.elements = newElements;
    }

    @Override
    public boolean contains(D element) {
        for (int i = 0; i < size; ++i) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(D element) {

    }

    // внутренний класс
    private class ArrayListIterator implements Iterator<D> {

        // текущая позиция итератора
        private int current = 0;

        @Override
        public D next() {
            // запомнили эл-т, который хотим вернуть
            D element = elements[current];
            // сдвигаем позицию итератора
            ++current;
            // возвращем эл-т
            return element;
        }

        @Override
        public boolean hasNext() {
            // пока не долшли до конца списка, возвращаем true
            return current < size;
        }
    }

    @Override
    public Iterator<D> iterator() {
        return new ArrayListIterator();
    }

}
