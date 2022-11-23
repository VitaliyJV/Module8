package org.example;

public class Circle extends Shape {
    private double radius;
    public void setRadius(double radius) {
        this.radius=radius
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String outingOfShape() {
        return "Circle";
    }
}
