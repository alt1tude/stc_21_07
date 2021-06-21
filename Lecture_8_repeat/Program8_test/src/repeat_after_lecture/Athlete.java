package repeat_after_lecture;

public class Athlete extends Human {

    private static final int MIN_RANK = 1;
    private int rank;

    private int stepsCount;

    public Athlete(String name, int age, int rank) {
        //вызов конструктора из Human
        super(name, age);

        if (rank >= MIN_RANK) {
            this.rank = rank;
        } else {
            this.rank = MIN_RANK;
        }
        this.stepsCount = 0;
    }

    public void run() {
        System.out.println(name + " побежал, сделал 50 шагов");
        this.stepsCount += 50;
    }

    public int getRank() {
        return rank;
    }
}
