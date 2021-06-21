package repeat1_after_lecture;


public class Work {

    public void doWork(WorkMan[] workMen) {
        for (int i = 0; i < workMen.length; ++i) {
            workMen[i].work();
        }
    }

    public void giveSalary(SalaryMan[] salaryMen) {
        for (int i = 0; i < salaryMen.length; ++i) {
            salaryMen[i].getSalary();
        }
    }
}
