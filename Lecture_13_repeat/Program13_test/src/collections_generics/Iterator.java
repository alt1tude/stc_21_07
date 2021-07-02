package collections_generics;

public interface Iterator<B> {
    /**
     * перейте к следующему эл-ту
     * @return эл-т
     */
    B next();

    /**
     * проверить, есть ли следующий эл-т
     * @return true, если есть
     */
    boolean hasNext();
}
