package com.muntian.ClassWork.CW17_07_17.CW11_09_17;

public class Rectangle extends Figure {
private double sideA;
private double sideB;

    public Rectangle(String name,double sideA, double sideB) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public double getSquare() {
        return sideA*sideB;
    }
}
