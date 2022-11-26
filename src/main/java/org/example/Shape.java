package org.example;

public interface Shape {
    default String outingOfShape() {
        return "This is basic Shape";
    }
}
