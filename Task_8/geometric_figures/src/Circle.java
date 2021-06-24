public class Circle extends Ellipse {

    public Circle(Point center, double radius) {
        super(center, radius, radius);
    }

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double square() {
        return 0;
//        return Math.PI * Math.pow(radius, 2);
    }
}
