package static_nested;

//внешний класс
public class Table {
    private static final int MAX_TABLE_SIZE = 10;

    private TableEntry[] entries;

    private int count;

    public Table() {
        this.entries = new TableEntry[MAX_TABLE_SIZE];
        this.count = 0;
    }

    //вложенный статический класс
    //добавили private ("закрыли" его), создается на основе класса(своего внешнего)
    public static class TableEntry {
        String key;
        int value;

        TableEntry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    //внутренний класс(без static), создается на основе объекта
    public class Iterator {
        private int current;

        public Iterator() {
            this.current = 0;
        }

        public TableEntry next() {
            if (current == count) {
                return null;
            }
            TableEntry currentEntry = entries[current];
            ++current;
            return currentEntry;
        }
    }

    public void put(String key, int value) {
        TableEntry tableEntry = new TableEntry(key, value);
        this.entries[count] = tableEntry;
        ++count;
    }
}
