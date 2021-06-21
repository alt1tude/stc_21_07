package repeat1_after_lecture;

public class Main3 {
    public static void main(String[] args) {
        WorkMan w1 = new Programmer("Artem", 32, 9);
        WorkMan w2 = new Student("Maksim", 22, 4);
        //больше создать не удается на основе данного interface, т.к. всего его 2 implements

        Work work = new Work();
//        work.doWork(new WorkMan[]{w1, w2});

        work.giveSalary(new SalaryMan[]{new Athlete("airat",22, 5),
                new Programmer("Artem", 32,9)});
    }
}
