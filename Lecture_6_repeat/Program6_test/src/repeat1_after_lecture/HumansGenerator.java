package repeat1_after_lecture;

import java.util.Random;

public class HumansGenerator {
    public String randomName() {
        Random random = new Random();
        char[] name = new char[10];
        for (int i = 0; i < name.length; ++i) {
            name[i] = (char)(random.nextInt(92 - 65) + 65);
        }
        return new String(name);
    }

    public Human[] generateHumans(int humansCount) {
        Random random = new Random();
        Human[] humans = new Human[humansCount];
        for (int i = 0; i < humans.length - 1; ++i) {
            Human newHuman = new Human(randomName(), random.nextInt(120));
            humans[i] = newHuman;
        }

        Human defaultHuman = new Human();
        humans[humansCount - 1] = defaultHuman;

        return humans;
    }
}
