package repeat2_after_lecture;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void goToBus(Bus bus) {
        bus.addPassenger(this);
    }

    public String getName() {
        return name;
    }

}
