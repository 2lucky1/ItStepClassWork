package com.muntian.ClassWork.CW17_07_17.CW01_09_17;

public class Rectangles {
    private Point upperLeftCorner = new Point();
    private Point lowRightCorner = new Point();

    public Rectangles(double x1, double x2, double y1, double y2) {
        this.upperLeftCorner.setX(x1);
        this.lowRightCorner.setX(x2);
        this.upperLeftCorner.setY(y1);
        this.lowRightCorner.setY(y2);
    }

    public boolean isCrossing(Rectangles anotherRectangle) {
        return true;
    }

    public boolean isPointInside() {
        return true;
    }

}
