package repeat1_after_lecture;

public class Student extends Human implements WorkMan {
   private double avgMark;

    public Student(String name, int age, double avgMark) {
        super(name, age);
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void run() {
        System.out.println("Студент " + name + " побежал, сделал 5 шагов");
        this.stepsCount += 5;
    }

    public void work() {
        System.out.println("Студент пошел на работу");
    }


}
