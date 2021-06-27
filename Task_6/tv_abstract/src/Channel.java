import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Channel {

    private String name;
    private Program[] programs;
    private int programsCount;
    private int channelCapacityForPgm = 5;

    public Channel(String name) {
        this.name = name;
        this.programs = new Program[channelCapacityForPgm];
    }

    public void addProgram(Program program) {
        if (programsCount >= channelCapacityForPgm) {
            channelCapacityForPgm = channelCapacityForPgm + channelCapacityForPgm / 2;
            programs = Arrays.copyOf(programs, channelCapacityForPgm);
        }
        programs[programsCount] = program;
        ++programsCount;
    }

    // метод вывода случайной программы
//    public Program randomProgram() {
//        return programs[ThreadLocalRandom.current().nextInt(programsCount)];
//    }

    // или
    public void randomProgram() {
        if (programsCount != 0) {
            int randomNumber = ThreadLocalRandom.current().nextInt(programsCount);
            System.out.println("Вдруг включилась программа " + programs[randomNumber].getName());
        } else {
            System.err.println("На канал " + name + " пока не добавлены программы");
        }
    }

    public String getName() {
        return name;
    }

}
