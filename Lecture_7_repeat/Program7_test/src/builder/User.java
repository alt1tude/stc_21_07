package builder;

public class User {
    private String name;
    private String lastName;
    private int age;
    private boolean isWorker;

    public User(String name, String lastName, int age, boolean isWorker, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isWorker = isWorker;
        this.height = height;
        this.weight = weight;
    }

    private double height;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    private double weight;

}
