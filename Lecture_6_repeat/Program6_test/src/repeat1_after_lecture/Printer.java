package repeat1_after_lecture;

public class Printer {
    public void printHumans(Human[] humans) {
        for (int i = 0; i < 100; ++i) {
            System.out.println(humans[i].name + " " + humans[i].getAge());
        }
    }

    public void printAges(int[] ages) {
        for (int i = 0; i < ages.length; ++i) {
            System.out.println("Возраст - " + i + " встречается в " + ages[i] + " раз");
        }
    }
}
