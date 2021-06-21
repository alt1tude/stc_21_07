package repeat2_after_lecture;

public class Bus {
    private static final int MAX_PLACES_COUNT = 3;

    private int number;
    private String model;

    private Driver driver;

    private boolean isRun;

    private Passenger[] passengers;
    private int passengersCount;

    
    public Bus(int number, String model) {
        if (number >= 1) {
            this.number = number;
        } else {
            this.number = 1;
        }
        this.model = model;
        this.passengers = new Passenger[MAX_PLACES_COUNT];
    }

    public void setDriver(Driver driver) {
        if (!isRun) {
            this.driver = driver;
        } else {
            System.err.println("Автобус на линии, нельзя сменить водителя");
        }
    }

    public void addPassenger(Passenger passenger){
        if (!isRun) {
            if (passengersCount < MAX_PLACES_COUNT) {
                passengers[passengersCount] = passenger;
                ++passengersCount;
            } else {
                System.err.println("Мест нет!");
            }
        } else {
            System.err.println("Автобус на линии, нельзя пустить пассажира");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void go(){
        this.isRun = true;
        System.out.println("Автобус " + number + " модели " + model + " поехал под управлением " + driver.getName());
        for (int i = 0; i < passengersCount; ++i) {
            System.out.println("С нами едет: " + passengers[i].getName());
        }
    }

    public void stop() {
        this.isRun = false;
    }
}
