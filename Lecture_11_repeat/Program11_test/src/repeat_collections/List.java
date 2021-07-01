package repeat_collections;

// Список - это коллекция, где сохраняется порядок добавления эл-в
// если добавили эл-т 6-м, то он и будет доступен под 6-м номером
public interface List extends Collection {
    /**
     * Возвращает эл-т под заданным индексом
     *
     * @param index индекс эл-та
     * @return эл-т
     */
    int get(int index);

    void addFirst(int element);
}
