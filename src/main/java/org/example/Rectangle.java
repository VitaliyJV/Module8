package org.example;

public class Rectangle extends Shape implements CarryAble {
    public void carry() {
        System.out.println("I am carry rectangle");
    }
    private int sideA;
    private int sideB;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getSideA() {
        return sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }
    @Override
    public String outingOfShape() {
        return "Rectangle";
    }
}
