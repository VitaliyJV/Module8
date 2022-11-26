package org.example;

public class Quad implements Shape, CarryAble {
    @Override
    public String carry() {
        return "I am carrying quad";
    }
    private int side;
    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    @Override
    public String outingOfShape() {
        return "Quad";
    }
}
