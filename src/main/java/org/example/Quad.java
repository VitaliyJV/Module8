package org.example;

public class Quad implements Shape, CarryAble {
    public void carry() {
        System.out.println("I am carry quad");
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
