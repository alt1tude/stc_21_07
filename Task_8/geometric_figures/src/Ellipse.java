public class Ellipse extends Figure {

    public Ellipse(Point center, double sideA, double sideB) {
        super(center, sideA, sideB);
    }

    public Ellipse(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double square() {
        return 0;
    }
}
