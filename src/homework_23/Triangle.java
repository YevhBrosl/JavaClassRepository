package homework_23;

import java.util.SortedMap;

public class Triangle extends Rectangle {

    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        super(sideA, sideB);
        this.sideC = sideC;
        this.height = height;
    }


    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        double result = (getSideA() * getHeight() / 2);
        System.out.println("Area of the triangle: " + result);
        return result;
    }

    @Override
    public double findPerimeter() {
        double result = getSideA() + getSideB() + getSideC();
        System.out.println("Perimeter of the triangle: " + result);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle {" + " sideA = " + getSideA() + ", sideB = " + getSideB() +
                ", sideC = " + sideC +
                ", height = " + height +
                '}';
    }
}
