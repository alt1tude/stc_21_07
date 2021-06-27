public class Ellipse extends Figure {

    public Ellipse(Point center, double bigRadius, double littleRadius) {
        super(center, bigRadius, littleRadius);
    }

    public Ellipse(double bigRadius, double littleRadius) {
        super(bigRadius, littleRadius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2))/8);
    }

    @Override
    public double square() {
        return Math.PI * getSideA() / 2 * getSideB() / 2;
    }
}
