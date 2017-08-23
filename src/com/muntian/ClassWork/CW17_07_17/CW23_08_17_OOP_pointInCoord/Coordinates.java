package com.muntian.ClassWork.CW17_07_17.CW23_08_17_OOP_pointInCoord;

public class Coordinates {
    private static final int SORT_DISTENCE_TO_ZIRO = 1;

    public static void main(String[] args) {

        Point firstPoint = new Point();
        firstPoint.name = "first point";
        firstPoint.x = 1;
        firstPoint.y = 2;
        Point secondPoint = new Point();
        secondPoint.name = "second point";
        secondPoint.x = 4;
        secondPoint.y = 3;
        Point thirdPoint = new Point();
        thirdPoint.name = "third point";
        thirdPoint.x = -2;
        thirdPoint.y = 1;
        Point fourthPoint = new Point();
        fourthPoint.name = "fourth point";
        fourthPoint.x = -4;
        fourthPoint.y = -10;

        Point[] points = {firstPoint, secondPoint, thirdPoint, fourthPoint};
        sortPoints(points, SORT_DISTENCE_TO_ZIRO);
        printPoints(points);
    }

    private static double findDistance(Point point) {
        return Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2));
    }

    private static Point[] sortPoints(Point[] points, int sortParameter) {
        int n = points.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparePoints(points[j - 1], points[j], sortParameter)) {
                    Point temp = points[j - 1];
                    points[j - 1] = points[j];
                    points[j] = temp;
                }
            }
        }
        return points;
    }

    private static boolean comparePoints(Point point1, Point point2, int sortParameter) {
        switch (sortParameter) {
            case SORT_DISTENCE_TO_ZIRO:
                return findDistance(point1) > findDistance(point2);
        }
        return false;
    }

    private static void printPoints(Point[] points) {
        System.out.println("Name\t\t\tХ\t\t\tY");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < points.length; ++i) {
            System.out.printf("%s\t\t\t%d\t\t\t%d%n",
                    points[i].name,
                    points[i].x,
                    points[i].y);
        }
    }


}
