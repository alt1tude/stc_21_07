package repeate_after_lecture.proxy_light;

public class Driver {
     private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println(name + " поехал");
    }

    public String getName() {
        return name;
    }

}
