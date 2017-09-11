package com.muntian.ClassWork.CW17_07_17.CW11_09_17;

public class Triangle extends Figure {
private double base;
private double height;
    public Triangle(String name,double base,double hight) {
        super(name);
        this.base = base;
        this.height = hight;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }

    @Override
    public double getSquare() {
        return 0.5*base*height ;
    }
}
