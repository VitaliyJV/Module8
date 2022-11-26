package org.example;

class Test {
    public static int a;
        public static void main(String[] args) {
            Shape shape = new Rectangle();
            ShapePrinter printer = new ShapePrinter(); a++;
            printer.getShapeName(shape);
            Quad shape1 = new Quad(); a++;
            printer.getShapeName(shape1);
            Shape shape2 = new Triangle(); a++;
            printer.getShapeName(shape2);
            Shape shape3 = new Circle(); a++;
            printer.getShapeName(shape3);
            Shape shape4 = new Ellipse(); a++;
            printer.getShapeName(shape4);
            }
}



