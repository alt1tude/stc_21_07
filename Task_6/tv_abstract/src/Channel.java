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

    public Program randomProgram() {
        return programs[ThreadLocalRandom.current().nextInt(programsCount)];
    }

    public void printProgram (String name, Program program) {
        System.out.println("По " + name + " смотрим " + program.getName());
    }

    //канал включается в телевизоре
    public void tvOn(TV tv) {
        tv.addChannel(this);
    }

    public String getName() {
        return name;
    }

}
