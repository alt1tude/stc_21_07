package repeat1_after_lecture;

public class Main2 {
    public static void main(String[] args) {
        Arena arena = new Arena();
        Athlete airat = new Athlete("Airat", 22, 5);
        Student student = new Student("Максим", 22, 4.9);
        Programmer programmer = new Programmer("Artem", 32, 3);

        Human h1 = airat;
        Human h2 = student;
        Human h3 = programmer;

        //Human[] runners = {h1, h2, h3};
        Human[] runners = {airat, student, programmer};

        arena.start(runners);
    }
}
