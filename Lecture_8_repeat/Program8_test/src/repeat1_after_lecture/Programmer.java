package repeat1_after_lecture;

public class Programmer extends Human implements WorkMan, SalaryMan {
    private int experience;

    public Programmer (String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public void work() {
        System.out.println("Программист работает");
        ++this.experience;
    }

    public void run() {
        System.out.println("Программист " + name + " побежал, сделал 3 шага");
        this.stepsCount += 3;
    }

    public void getSalary(){
        System.out.println(name + " Ура, зарплата!");
    }
}
