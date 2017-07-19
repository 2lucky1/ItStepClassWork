package com.muntian.ClassWork_19_07_17;

import java.util.Scanner;

/**
 * Created by student on 19.07.2017.
 */
public class FindeTheDate {

    static final int YEAR = 0;
    static final int MONTH = 1;
    static final int DAY = 2;
    static final int LONGMONTH = 31;
    static final int SHORTMONTH = 30;
    static final int FEBRUARYSHORT = 28;
    static final int FEBRUARYLONG = 29;
    static int sizeOfMonth;
    static int numberOfMonth;

    public static void main(String[] args) {

        int[] date = new int[3];
        int[] yesterday = new int[3];
        int[] tomorrow = new int[3];
        askUserForData(date);
        System.out.println(sizeOfMonth);
        System.out.println("You entered this date:");
        System.out.println(dateToString(date));
        System.out.println();
        countYesterday(date, yesterday);
        System.out.println("A date of previous day");
        System.out.println(dateToString(yesterday));
        System.out.println();
        countTomorrow(date, tomorrow);
        System.out.println("A date of next day");
        System.out.println(dateToString(tomorrow));


    }

    public static String dateToString(int[] date) {
        String n = "-1";
        String m = "-1";
        if (date[DAY] < 10) {
            n = "0" + Integer.toString(date[DAY]);
        } else {
            n = Integer.toString(date[DAY]);
        }
        if (date[MONTH] < 10) {
            m = "0" + Integer.toString(date[MONTH]);
        } else {
            m = Integer.toString(date[MONTH]);
        }
        String g = Integer.toString(date[YEAR]);
        return n + "." + m + "." + g;
    }

    public static void askUserForData(int[] date) {
        date[YEAR] = enterOfYearByUser();
        date[MONTH] = enterOfMonthByUser();
        date[DAY] = enterOfDayByUser(checkForALeapYear(date[YEAR]), numberOfMonth);
    }

    public static int enterOfYearByUser() {
        System.out.println("Enter year");
        int g;
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                g = input.nextInt();
                if (g > 0) {
                    return g;
                }
            }
            System.out.println("Error: enter an integer from 0 to plus infinity");
        }
    }

    public static boolean checkForALeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int enterOfMonthByUser() {
        System.out.println("Enter month");
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                numberOfMonth = input.nextInt();
                if (numberOfMonth > 0 && numberOfMonth < 13) {
                    return numberOfMonth;
                }
            }
            System.out.println("Error: enter an integer from 1 to 12");
        }
    }

    public static int enterOfDayByUser(boolean leapYear, int month) {
        System.out.println("Enter day");
        int d;
        sizeOfMonth = countingDaysInAMonth(month, leapYear);
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                d = input.nextInt();
                if (d > 0 && d <= sizeOfMonth) {
                    return d;
                }
            }
            System.out.println("Error: enter an integer from 1 to " + sizeOfMonth);
        }
    }

    public static int countingDaysInAMonth(int month, boolean leapYear) {
        switch (month) {
            case 1:
                return LONGMONTH;
            case 3:
                return LONGMONTH;
            case 5:
                return LONGMONTH;
            case 7:
                return LONGMONTH;
            case 8:
                return LONGMONTH;
            case 10:
                return LONGMONTH;
            case 12:
                return LONGMONTH;
            case 2:
                if (leapYear) {
                    return FEBRUARYLONG;
                } else {
                    return FEBRUARYSHORT;
                }
            case 4:
                return SHORTMONTH;
            case 6:
                return SHORTMONTH;
            case 9:
                return SHORTMONTH;
            case 11:
                return SHORTMONTH;
        }
        System.out.println("Game over");
        return -1;
    }

    public static void countYesterday(int[] date, int[] yesterday) {
        if (date[DAY] != 1) {
            yesterday[DAY] = date[DAY] - 1;
            yesterday[MONTH] = date[MONTH];
            yesterday[YEAR] = date[YEAR];
        } else if (date[MONTH] != 1) {
            yesterday[DAY] = countingDaysInAMonth(date[MONTH] - 1, checkForALeapYear(date[YEAR]));
            yesterday[MONTH] = date[MONTH] - 1;
            yesterday[YEAR] = date[YEAR];
        } else {
            yesterday[DAY] = LONGMONTH;
            yesterday[MONTH] = 12;
            yesterday[YEAR] = date[YEAR] - 1;
        }
    }

    public static void countTomorrow(int[] date, int[] tomorrow) {
        if (date[DAY] != sizeOfMonth) {
            tomorrow[DAY] = date[DAY] + 1;
            tomorrow[MONTH] = date[MONTH];
            tomorrow[YEAR] = date[YEAR];
        } else if (date[MONTH] != 12) {
            tomorrow[DAY] = 1;
            tomorrow[MONTH] = date[MONTH] + 1;
            tomorrow[YEAR] = date[YEAR];
        } else {
            tomorrow[DAY] = 1;
            tomorrow[MONTH] = 1;
            tomorrow[YEAR] = date[YEAR] + 1;
        }
    }
}
