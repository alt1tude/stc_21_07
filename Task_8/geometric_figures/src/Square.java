public class Square extends Rectangle {
    public Square(Point center, double sideA) {
        super(center, sideA, sideA);
    }

    public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double perimeter() {
        return 4 * getSideA();
    }

    @Override
    public double square() {
        return Math.pow(getSideA(),2);
    }
}
