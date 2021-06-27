public class Circle extends Ellipse {

    public Circle(Point center, double radius) {
        super(center, radius, radius);
    }

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getSideA();
    }

    @Override
    public double square() {
      return Math.PI * Math.pow(getSideA(), 2);
    }
}
