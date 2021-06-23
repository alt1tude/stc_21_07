public class Channel {
  private String name;

  private Program[] programs;
  private int programsCount = 0;
  private int capacityProgram = 5;

    public Channel(String name) {
        this.name = name;
        this.programs = new Program[capacityProgram];
    }

    public void addProgram(Program program){
        programs[programsCount] = program;
        ++programsCount;
    }

    public void randomProgramm() {

    }


}
