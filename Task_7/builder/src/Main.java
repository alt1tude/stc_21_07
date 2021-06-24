public class Main {

    public static void main(String[] args) {

        Machine machine = Machine.builder()
                    .setColor("black")
                    .setModel("TZ-330k")
                .build();

        Machine machine1 = Machine.builder()
                    .setName("Milling_machine")
                    .setExpirationYear(2025)
                .build();

        System.out.println(machine);
        System.out.println(machine1);

    }
}
