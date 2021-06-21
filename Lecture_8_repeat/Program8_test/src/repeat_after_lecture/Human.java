package repeat_after_lecture;

public class Human {
    private static final int MIN_AGE = 0;

    protected String name;
    private int age;

    protected int stepsCount;

    public Human(String name, int age) {
        this.name = name;
        if (age >= MIN_AGE) {
            this.age = age;
        } else {
            this.age = MIN_AGE;
        }

        this.stepsCount = 0;
    }

    public void go() {
        System.out.println(name + " пошел, сделал 1 шаг");
        ++this.stepsCount;
    }

    public void run() {
        System.out.println(name + " побежал, сделал 10 шагов");
        this.stepsCount += 10;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStepsCount() {
        return stepsCount;
    }
}
