package org.example;

public class Ellipse implements Shape, RollAble {
    @Override
    public String roll() {
        return "I am rolling ellipse";
    }
    private double R1;
    private double R2;
    private double Exc;

    public void setR1(double r1) {
        R1 = r1;
    }
    public double getR1() {
        return R1;
    }
    public void setR2(double r2) {
        R2 = r2;
    }
    public double getR2() {
        return R2;
    }
       public void setExc(double exc) {
        Exc = exc;
    }
    public double getExc() {
        return Exc;
    }
    @Override
    public String outingOfShape() {
        return "Ellipse";
    }
}
