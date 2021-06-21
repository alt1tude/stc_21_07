package repeat2_after_lecture;

public class Main2 {
    public static void main(String[] args) {
        Driver ivan = new Driver("Ivan", "Ivanov", 5);
        Driver artem = new Driver("Artem", "Prokopiev", 9);
        Bus bus = new Bus(22, "Нефаз");

        Passenger p1 = new Passenger("Fedya");
        Passenger p2 = new Passenger("Katya");
        Passenger p3 = new Passenger("Evgen");
        Passenger p4 = new Passenger("Elena");

        p1.goToBus(bus);
        p2.goToBus(bus);
        p3.goToBus(bus);
        p4.goToBus(bus);

        ivan.goToBus(bus);

        ivan.drive();
        artem.goToBus(bus);

        p4.goToBus(bus);
    }
}
