public class Main {

    public static void main(String[] args) {
	    Figure circle = new Circle(10);

        System.out.println(circle);

        circle.move(10, 10);

        System.out.println(circle);

        circle.setScale(1.5);

        System.out.println(circle);

    }
}
