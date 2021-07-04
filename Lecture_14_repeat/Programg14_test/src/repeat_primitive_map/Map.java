package repeat_primitive_map;

// ключ должны быть уникальные(как и индексы в массивах)
public interface Map<K, V> {
    void put(K key, V value);

    V get(K key);
}
