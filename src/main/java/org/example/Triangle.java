package org.example;

public class Triangle extends Shape implements CarryAble {
    public void carry() {
        System.out.println("I am carry triangle");
    }
    private int side1;
    private int side2;
    private double corner;
    public void setSide1(int side1) {
        this.side1 = side1;
    }
    public int getSide1() {
        return side1;
    }
    public void setSide2(int side2) {
        this.side2 = side2;
    }
    public int getSide2() {
        return side2;
    }
    public void setCorner(double corner) {
        this.corner = corner;
    }
    public double getCorner() {
        return corner;
    }
    @Override
    public String outingOfShape() {
        return "Triangle";
    }
}
