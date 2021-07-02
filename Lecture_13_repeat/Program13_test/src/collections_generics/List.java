package collections_generics;

// Список - это коллекция, где сохраняется порядок добавления эл-в
// если добавили эл-т 6-м, то он и будет доступен под 6-м номером

// List<String> -> Collection<String> -> Iterator<String> -> String next();
public interface List<C> extends Collection<C> {
    /**
     * Возвращает эл-т под заданным индексом
     *
     * @param index индекс эл-та
     * @return эл-т
     */
    C get(int index);

    void addFirst(C element);
}
