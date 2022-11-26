package org.example;

public class Circle implements Shape, RollAble {
    public String roll() {
        return  "I am rolling circle";
    }
    private double radius;
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String outingOfShape() {
        return "Circle";
    }
}
