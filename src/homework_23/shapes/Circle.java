package homework_23.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        double result = PI * Math.pow(getRadius(), 2);
        System.out.println("Area of the circle: " + result);
        return result;
    }

    @Override
    public double findPerimeter() {
        double result = 2 * PI * getRadius();
        System.out.println("The circumference: " + result);
        return result;
    }

    @Override
    public String toString() {
        return "Circle { " +
                "radius = " + radius +
                '}';
    }
}
