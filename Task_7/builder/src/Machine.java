public class Machine {
    private String name;
    private String model;
    private int volume;
    private String color;
    private int expirationYear;

    private Machine(String name, String model, int volume, String color, int expirationYear) {
        this.name = name;
        this.model = model;
        this.volume = volume;
        this.color = color;
        this.expirationYear = expirationYear;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", expirationYear=" + expirationYear +
                '}';
    }

    public static MachineBuilder builder() {
        return new MachineBuilder();
    }

    public static class MachineBuilder {
        private String name;
        private String model;
        private int volume;
        private String color;
        private int expirationYear;

        public MachineBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MachineBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public MachineBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public MachineBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public MachineBuilder setExpirationYear(int expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        public Machine build() {
            return new Machine(name, model, volume, color, expirationYear);
        }

    }

}
