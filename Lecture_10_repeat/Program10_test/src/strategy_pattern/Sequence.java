package strategy_pattern;

public interface Sequence {
    /**
     * Проверка, есть ли элемент в последовательности
     * @param element искомый элемент
     * @return true, если найден
     */
    boolean search(int element);

    /**
     * Получить представление последовательности в виде массива
     * @return массив
     */

    int[] toArray();
}
