package com.epam.hometask;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Rectangle("white", 2.5, 5.0),
                                     new Rectangle("black", 3.5, 6.0),
                                     new Rectangle("pink", 2.8, 4.2),
                                     new Rectangle("green", 4.1, 8.0),
                                     new Circle("red", 6.5),
                                     new Circle("blue", 7.5),
                                     new Circle("brown", 8.5),
                                     new Triangle("grey", 4.5, 5.5, 6.0),
                                     new Triangle("brown", 6.0, 9.0, 8.0)};
        printShapes(shapes);
        System.out.println("The sum of all squares = " + calcShapesSquare(shapes));
    }

    static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape + ",  " + "square = " + shape.calcArea());
        }
    }
     static double calcShapesSquare(Shape[] shapes) {
        double square = 0;
        for (Shape shape : shapes) {
            square = square + shape.calcArea();
        }  return square;
    }
}