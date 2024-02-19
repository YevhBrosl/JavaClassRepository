package homework_23.shapes;

public class ShapesDemo {
    public static void main(String[] args) {
        Triangle ABC = new Triangle(12.0, 6.5, 8, 5.5);
        System.out.println(ABC.toString());
        ABC.findArea();
        ABC.findPerimeter();

        System.out.println("===================================");

        Rectangle rectangle = new Rectangle(5.5, 7);
        System.out.println(rectangle.toString());
        rectangle.findArea();
        rectangle.findPerimeter();

        System.out.println("===================================");

        Circle circle = new Circle(6);
        System.out.println(circle.toString());
        circle.findArea();
        circle.findPerimeter();

        System.out.println("===================================");

        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle(3,4,5,3.5);
        shapes[1] = new Rectangle(5,10);
        shapes[2] = new Circle(4);

        double currentArea;
        double generalArea = 0.0;

        for (int i = 0; i < shapes.length; i++) {
            currentArea = shapes[i].findArea();
            generalArea += currentArea;
        }System.out.printf("Общая площадь всех фигур: %.2f\n", generalArea);

        System.out.println("===================================");

        double currentPerimeter;
        double generalPerimeter = 0.0;

        for (Shape shape : shapes) {
            currentPerimeter = shape.findPerimeter();
            generalPerimeter += currentPerimeter;
        }System.out.println("Общий периметр всех фигур: " + generalPerimeter);
    }
}
