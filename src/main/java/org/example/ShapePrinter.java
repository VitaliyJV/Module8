package org.example;

import static org.example.Test.a;

public class ShapePrinter {
        public void getShapeName(Shape shape) {
        String outing = shape.outingOfShape();
        System.out.println(a + ". " + outing);
        }
}

