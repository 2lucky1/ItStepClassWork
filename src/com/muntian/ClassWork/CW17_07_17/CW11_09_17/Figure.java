package com.muntian.ClassWork.CW17_07_17.CW11_09_17;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Draw a figure in console
     */
    public abstract void draw();

    /**
     * Calculate a square of a figure
     * @return the square of this figure
     */
    public abstract double getSquare();
}
