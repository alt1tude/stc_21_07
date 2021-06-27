public class Rectangle extends  Figure{
    public Rectangle(Point center, double sideA, double sideB) {
        super(center, sideA, sideB);
    }

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double perimeter() {
        return 2 * (getSideA() + getSideB());
    }

    @Override
    public double square() {
        return getSideA() * getSideB();
    }
}
