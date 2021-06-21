package repeat1_after_lecture;

public class HumanStatistic {
    public int[] calcAges(Human humans[], int maxAges) {
        int[] ages = new int[maxAges];

        for (int i = 0; i < humans.length; ++i) {
            int currentAge = humans[i].getAge();
            ++ages[currentAge];
        }
        return ages;
    }
}
