package com.muntian.ClassWork_19_07_17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by student on 19.07.2017.
 */
public class FindeTheDate {

    static final int YEAR = 0;
    static final int MONTH = 1;
    static final int DAY = 2;

    public static void main(String[] args) {

        int[] date = new int[3];
        int[] yesterday = new int[3];
        int[] tomorrow = new int[3];
        askUserForData(date);
//        countYesterday(date);
//        System.out.println("A date of previous day" + dateToString(yesterday));
//        countTomorrow(date);
//        System.out.println("A date of next day" + dateToString(yesterday));


    }

    public static String dateToString(int[] date) {
        return "qwerty";
    }

    public static void askUserForData(int[] date) {
        date[YEAR] = enterOfYearByUser();
        date[MONTH] = enterOfMonthByUser();
        date[DAY] = enterOfDayByUser();
    }

    public static int enterOfYearByUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        while (true){
            if (input.hasNextInt()){

            }
        }



        if (!input.hasNextInt()) {
            System.out.println("Error: enter an integer from 0 to infinity");
            enterOfYearByUser();
        }
        int g = input.nextInt();
        if (g < 0) {
            System.out.println("Error: enter an integer from 0 to infinity");
            enterOfYearByUser();
        }
        return g;
    }


    public static int enterOfMonthByUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");
        int m = input.nextInt();
        if (m % 1 == 0 && m > 0 && m < 13) {
            return m;
        } else {
            System.out.println("Error: enter a number from 1 to 12");
            enterOfMonthByUser();
        }
        return -1;
    }

    public static int enterOfDayByUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day");
        if (input.hasNextInt() && input.nextInt() > 0 && input.nextInt() < 32) {
            return input.nextInt();
        } else {
            System.out.println("Error: enter a number from 1 to 31");
            enterOfDayByUser();
        }
        return -1;
    }

}
