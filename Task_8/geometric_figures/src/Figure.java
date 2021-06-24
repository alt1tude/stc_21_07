public abstract class Figure implements Scalable, Movable {
    Point center;

    private double sideA;
    private double sideB;

    @Override
    public String toString() {
        return "Figure{" +
                "center=" + center +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public Figure(Point center, double sideA, double sideB) {
        this.center = center;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Figure(double sideA, double sideB) {
        this(new Point(), sideA, sideB);
    }

    public abstract double perimeter();

    public abstract double square();

    @Override
    public void move(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

    @Override
    public void setScale(double scale) {
        this.sideA *= scale;
        this.sideB *= scale;

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
