package homework_23.shapes;

import homework_23.shapes.Rectangle;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
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
