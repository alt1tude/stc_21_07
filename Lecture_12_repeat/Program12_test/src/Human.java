import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private boolean isWorker;

    public Human(String name, int age, boolean isWorker) {
        this.name = name;
        this.age = age;
        this.isWorker = isWorker;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWorker=" + isWorker +
                '}';
    }
    // даже тогда, когда ссылки разные(переопределение стандартного метода в качестве теста)
    // true если объекты равны не по ссылки, а по вложенным полям
    @Override
    public boolean equals(Object object) {
//        if (object == null){
//            return false;
//        }
        // убедиться, что в Object находится объяект того же класса, какого типа наш класс
        // если этот Object не экземпляр Human
        if (!(object instanceof Human)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        // на данном этапе знаем, что object - это экземпляр Human, он не null
        // и он не тот же самый, который сравниваем
        // можно сделать явное понижающее преобразование гарантированно без ошибок
        Human that = (Human) object;

        return this.age == that.age
                && this.isWorker == that.isWorker
                && this.name.equals(that.name);
    }

    // генерируемое переопределение через IDEA
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Human human = (Human) o;
//        return age == human.age && isWorker == human.isWorker && Objects.equals(name, human.name);
//    }


// передали в метод для переопределения не сам супер-класс, а его потомка
//    public boolean equals(Human that) {
//        if (that == null) {
//            return false;
//        }
//
//        if (this == that) {
//            return true;
//        }
//
//        return this.name.equals(that.name) && this.isWorker == that.isWorker() && this.age == that.age;
//    }
}
