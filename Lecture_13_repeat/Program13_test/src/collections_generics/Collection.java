package collections_generics;

// Данный интерфейс подразумевает возможность сохранять эл-ты в каком-либо наборе
// при этом порядок(кого и за кем добавили) эл-в не играет роли
public interface Collection<A> {
    /**
     * Добавляем эл-т в коллекцию
     * @param element добавляемый элемент
     */
    void add(A element);

    /**
     * Проверяем, есть ли эл-т в коллекции
     * @param element искомый элемент
     * @return true, если эл-т нашелся хотя бы 1 раз
     */
    boolean contains(A element);

    /**
     * Получаем кол-во эл-в коллекции
     * @return возвращает число эл-в
     */
    int size();

    /**
     * удаляет первое вхождение эл-та в список
     * @param element удаляемый эл-т
     */

    void remove(A element);

    Iterator<A> iterator();
}
