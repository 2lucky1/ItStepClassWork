package com.muntian.ClassWork.CW17_07_17.CW11_09_17;

public class Circle extends Figure {

    public Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
