package com.epam.hometask;

public class Circle extends Shape {
    private double radius;
    double number_p = 3.14;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius;
    }

    @Override
         double calcArea() {
        return (radius * radius*number_p);
    }
}
