package repeat_after_lecture;

// пример обобщения или Generic(или еще называют параметризированный тип)
public class Cover<T> {
    private T phone;

    public void setPhone(T phone) {
        this.phone = phone;
    }

    public T getPhone() {
        return this.phone;
    }
}
