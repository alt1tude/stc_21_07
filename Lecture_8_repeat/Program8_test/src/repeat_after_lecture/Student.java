package repeat_after_lecture;

public class Student extends Human {
   private double avgMark;

    public Student (String name, int age, double avgMark) {
        super(name, age);
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }
}
