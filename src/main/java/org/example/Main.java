package org.example;

class Test {

    public static void main(String[] args) {

            Shape shape = new Rectangle();
            ShapePrinter printer=new ShapePrinter();
            printer.getShapeName(shape);
            Shape shape1 = new Quad();
            printer.getShapeName(shape1);
            Shape shape2 = new Triangle();
            printer.getShapeName(shape2);



    }
}



