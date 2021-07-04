package repeat_primitive_map;

public class HashMap<K, V> implements Map<K, V> {

    private static final int MAX_TABLE_SIZE = 8;

//    private V[] values;

    private static class MapEntry<K, V> {
        K key;
        V value;
        MapEntry<K, V> next;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private MapEntry<K, V>[] table;

    public HashMap() {
        this.table = new MapEntry[MAX_TABLE_SIZE];
    }

    @Override
    public void put(K key, V value) {
        // получили хэш ключа, например для "Максим" - 1076425247
        int hash = key.hashCode();
        // обрезали хэщ код для диапазона нашей таблицы 1076425247 ? 7 = 7
        int index = hash & (table.length - 1);
//        this.values[index] = value;
        // посмотрим, есть ли в данном индексе уже какие-то эл-ты, если нет добавляем новый узел
        if (table[index] == null) {
            table[index] = new MapEntry<>(key, value);
        } else {
            // если там уже были эл-ты,
            // нужно сделать проверку для ключа; если этот ключ был, но нужно заменить в нем значение
            MapEntry<K, V> current = table[index];

            while (current != null) {
                // если у текущего узла ключ совпал с тем, который подан на вход
                // т.е put("Марсель", 27) - 27 -> 28
                if (current.key.equals(key)) {
                    // замена
                    current.value = value;
                    return;
                }
                // обходим связный список
                current = current.next;
            }

            MapEntry<K, V> newEntry = new MapEntry<>(key, value);
            // указываем, что след. после нового этот, тот который уже был в таблице
            newEntry.next = table[index];
            // теперь новый эл-т 1й в ячейке
            table[index] = newEntry;
        }
    }

    @Override
    public V get(K key) {
        return null;
    }
}
