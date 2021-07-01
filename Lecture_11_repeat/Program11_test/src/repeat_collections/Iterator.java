package repeat_collections;

public interface Iterator {
    /**
     * перейте к следующему эл-ту
     * @return эл-т
     */
    int next();

    /**
     * проверить, есть ли следующий эл-т
     * @return true, если есть
     */
    boolean hasNext();
}
