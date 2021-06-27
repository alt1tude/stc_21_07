public class Main {

    public static void main(String[] args) {
	    Figure circle = new Circle(10);
        System.out.println(circle);
	    Figure ellipse = new Ellipse(20, 10);
	    Figure square = new Square(10);
	    Figure rectangle = new Rectangle(10, 15);

        //площадь круга
        System.out.println("Area of circle = " + circle.square());
        //периметр круга(длина окружности)
        System.out.println("Perimeter of circle = " + circle.perimeter());
        System.out.println("-----");
        //площадь эллипса через полуоси
        System.out.println("Area of ellipse = " + ellipse.square());
        //периметр эллипса через оси
        System.out.println("Perimeter of ellipse  = " + ellipse.perimeter());
        System.out.println("-----");
        //площадь прямоугольника
        System.out.println("Area of rectangle = " + rectangle.square());
        //периметр прямоугольника
        System.out.println("Perimeter of rectangle  = " + rectangle.perimeter());
        System.out.println("-----");
        //площадь квадрата
        System.out.println("Area of square = " + square.square());
        //периметр квадрата
        System.out.println("Perimeter of square = " + square.perimeter());

        circle.move(10, 10);
        System.out.println("Circle move " + circle);

        circle.setScale(1.5);
        System.out.println("Circle scale " + circle);
    }
}
