package repeat_after_lecture;

import java.util.StringJoiner;

public class Animal {
    public void who() {
        System.out.println("Животное");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
                .toString();
    }
}
