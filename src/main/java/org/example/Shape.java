package org.example;

public interface Shape {
    public default String outingOfShape() {
        return "This is basic Shape";
    }
}
