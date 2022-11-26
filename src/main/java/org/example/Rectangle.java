package org.example;

public class Rectangle implements Shape, CarryAble {
    @Override
    public String carry() {
        return "I am carrying rectangle";
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
