package com.muntian.ClassWork.CW17_07_17.CW11_09_17;

public class Point extends Figure {
    public Point(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println(".");
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
