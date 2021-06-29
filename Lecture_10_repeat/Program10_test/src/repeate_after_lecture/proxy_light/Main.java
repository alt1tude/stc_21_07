package repeate_after_lecture.proxy_light;

public class Main {

    public static void main(String[] args) {
        DriverProxy proxy = new DriverProxy("Fedya");

        proxy.setBefore(() -> {
            System.out.println(proxy.getName() + " собрался поехать");
        });

        proxy.setInstead(() -> {
            System.out.println("Куда все таки поехал");
        });
        proxy.setAfter(() -> {
            System.out.println("А кукухой ли?");
        });

        Driver airat = new Driver("Airat");
        Driver victor = new Driver("Victor");

        Driver[] drivers = {airat, victor, proxy};

        for (int i = 0; i < drivers.length; ++i) {
            drivers[i].drive();
        }

    }
}
