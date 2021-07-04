package repeat_hashes;

public class Human {
    private String firstName; // хеш строки - firstName.hashCode();
    private String lastName;
    private int age; // хеш int - это само число
    private double height; // double.hashCode();
    private boolean isWorker; // boolean.hashCode(); 1231 - true, 1237 - false

    public Human(String firstName, String lastName, int age, double height, boolean isWorker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.isWorker = isWorker;
    }

    @Override
    public int hashCode() {
        int hashes[] = {firstName.hashCode(), lastName.hashCode(), age, Double.hashCode(height),
                Boolean.hashCode(isWorker)};

        int h = 0;

        for (int i = 0; i < hashes.length; ++i) {
            h = 31 * h + hashes[i];
        }

        return h;
    }


}
