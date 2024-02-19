package homework_23.shapes;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double findArea() {
        double result = getSideA() * getSideB();
        System.out.println("Area of the rectangle: " + result);
        return result;
    }

    @Override
    public double findPerimeter() {
        double result = (getSideA() + getSideB()) * 2;
        System.out.println("Perimeter of the rectangle: " + result);
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                '}';
    }
}
