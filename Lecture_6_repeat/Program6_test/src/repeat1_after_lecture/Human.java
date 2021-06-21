package repeat1_after_lecture;

public class Human {
    String name;
    private int age;

    public Human() {
        name = "DEFAULT";
        age = 0;
    }

   public Human(String name, int age) {
        this.name = name;
        //age = Age;
        setAge(age);
    }
    //геттер
    public int getAge() {
        return age;
    }

    //сеттер
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

}
