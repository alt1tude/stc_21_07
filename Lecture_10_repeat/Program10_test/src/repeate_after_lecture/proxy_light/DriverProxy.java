package repeate_after_lecture.proxy_light;

// позволяет изменить поведение Driver без изменения самого класса
// и без необходимости изменения контекста использования данного класса
public class DriverProxy extends Driver {

    private Before before;
    private Instead instead;
    private After after;

    public DriverProxy(String name) {
        super(name);
    }
    @Override
    public void drive() {
        if (before != null) {
            before.execute();
        }

        if (instead != null) {
            instead.execute();
        } else {
            super.drive();
        }

        if (after != null) {
            after.execute();
        }
    }

    public void setBefore(Before before) {
        this.before = before;
    }

    public void setInstead(Instead instead) {
        this.instead = instead;
    }

    public void setAfter(After after) {
        this.after = after;
    }
}
