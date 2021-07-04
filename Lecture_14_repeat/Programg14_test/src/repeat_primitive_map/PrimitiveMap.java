package repeat_primitive_map;

public class PrimitiveMap<K, V> implements Map<K, V> {
    private static final int DEFAULT_SIZE = 10;

    // плохая реализация т.к. получение/добавление ключей значений выполняется в циклах
    // за O(N), где N - кол-во эл-в

    private static class MapEntry<K, V> {
        K key;
        V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // массив пар ключ-значение
    private MapEntry<K, V>[] entries;
    public int count;

    public PrimitiveMap() {
        this.entries = new MapEntry[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public void put(K key, V value) {
        MapEntry<K, V> entry = new MapEntry<>(key, value);
        // пробегаем по всем парам ключ-значение
        for (int i = 0; i < count; ++i) {
            // смотрим текущую пару
            MapEntry<K, V> current = entries[i];
            // если у этой пары ключ совпал с тем ключом, который мы подали на вход
            if (current.key.equals(key)) {
                // заменяем в этой паре значение
                current.value = value;
                // останавливаем вызов этого метода
                return;
            }
        }

        this.entries[count] = entry;
        ++count;
    }

    @Override
    public V get(K key) {
        // ищем по ключу - значение
        for (int i = 0; i < count; ++i) {
            MapEntry<K, V> current = entries[i];
            if (current.key.equals(key)) {
                return current.value;
            }
        }
        return null;
    }

}
