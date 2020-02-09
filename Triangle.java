package com.epam.hometask;
import java.lang.Math;

public class Triangle  extends Shape  {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a + ", b= " + b + ", c= " + c;
    }
    @Override
    double calcArea() {
        return (Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)))/4;
    }
}

