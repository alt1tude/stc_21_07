package repeat1_after_lecture;

public class Main {

    public static void main(String[] args) {

    	HumansGenerator generator = new HumansGenerator();
    	HumanStatistic statistic = new HumanStatistic();
    	Printer printer = new Printer();

		Human[] humans = generator.generateHumans(100);
		humans[3].setAge(-10);
		int[] ages = statistic.calcAges(humans, 120);

		printer.printHumans(humans);

		printer.printAges(ages);
	}
}
