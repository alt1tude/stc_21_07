package repeat_after_lecture;

public class Main {

    public static void main(String[] args) {
        Human ivan1 = new Human("Ivan1", 27);
        ivan1.go();
        ivan1.run();
        System.out.println(ivan1.getStepsCount());

        Athlete ivan2 = new Athlete("Ivan2", 22, 5);
        ivan2.go();
        ivan2.run();
        System.out.println(ivan2.getStepsCount());

        Student student = new Student("Student", 23, 4.8);
        student.run();
        System.out.println(student.getStepsCount());
    }

}


