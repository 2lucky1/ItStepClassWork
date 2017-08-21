package com.muntian.ClassWork.CW17_07_17.CW21_08_17;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        int[] coordOfFigure = selectCoordinates();
        int[] coordOfTarget = selectCoordinates();
        selectChessFigure();
        selectCoordinates();


    }

    private static void selectChessFigure() {
        System.out.println("Please, enter the number according your figure");
        System.out.println("Rook              1");
        System.out.println("Elephant          2");
        System.out.println("King              3");
        System.out.println("Queen             4");
        System.out.println("White pawn        5");
        System.out.println("Black pawn        6");
        System.out.println("Horse             7");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                boolean[][] areaOfRook = new boolean[8][8];

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
        }
    }

    private static boolean[][] areaOfVisibility(int[] coordinatesOfFigure) {
        for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 8; j++) {
                boolean[i][j] =true;
                }
            }
        }
    }

    private static int[] selectCoordinates() {
        int[] coordinates = new int[2];
        for (int i = 0; i < 2; i++) {
            oneCoordinate(coordinates, i);
        }
        return coordinates;
    }

    private static int[] oneCoordinate(int[] coordinates, int i) {
        while (true) {
            System.out.println("Enter the number from 1 to 8");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int userNumber = input.nextInt();
                if (userNumber > 0 && userNumber < 8) {
                    coordinates[i] = userNumber;
                }
            } else {
                System.out.println("Input error: Enter a natural integer number");
            }
        }

    }
}
