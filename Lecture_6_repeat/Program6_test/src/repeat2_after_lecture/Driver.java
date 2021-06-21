package repeat2_after_lecture;

public class Driver {
    private String name;
    private String lastName;
    private int experience;

    private Bus bus;

    public Driver(String name, String lastName, int experience) {
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
    }

    public void goToBus(Bus bus) {
        this.bus = bus;
        bus.setDriver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            experience = 0;
        }
    }

    public void drive(){
        bus.go();
    }
}
