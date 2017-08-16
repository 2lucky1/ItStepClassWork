package com.muntian.ClassWork.CW17_07_17.CW16_08_17;

import java.util.Scanner;

public class Exercise_6_98_deposit {

    public static double amountOfDeposit;
    public static double percent;
    public static double finalMonthlyIncrease;
    public static double totalDepositAmount;
    public static int monthOfExcessOfIncrease = 1;
    public static int monthOfExcessOfTotalDepositAmount = 1;
    public static double monthlyIncrease;

    public static void main(String[] args) {
        dataInput();

        calculationOfMonthOfExcessOfFinalMonthlyIncrease(percent, amountOfDeposit, finalMonthlyIncrease);
        System.out.println("Monthly increase is more thane specified value already in " + monthOfExcessOfIncrease + " month");

        calculationOfMonthOfExcessOfTotalDepositAmount(amountOfDeposit, percent, totalDepositAmount, monthOfExcessOfTotalDepositAmount);
        System.out.println("The deposit will exceed the value of " + totalDepositAmount + " in the" + monthOfExcessOfTotalDepositAmount + " month");
    }

    private static int calculationOfMonthOfExcessOfTotalDepositAmount(double amountOfDeposit, double percent, double totalDepositAmount, int monthOfExcessOfTotalDepositAmount) {
        for (int i = 1; amountOfDeposit <= totalDepositAmount; i++) {
            monthlyIncrease = amountOfDeposit * (percent / 100);
            amountOfDeposit = amountOfDeposit + monthlyIncrease;
            monthOfExcessOfTotalDepositAmount = i;
        }
        return monthOfExcessOfTotalDepositAmount;
    }

    private static int calculationOfMonthOfExcessOfFinalMonthlyIncrease(double percent, double amountOfDeposit, double finalMonthlyIncrease) {
        for (int i = 1; monthlyIncrease <= finalMonthlyIncrease; i++) {
            monthlyIncrease = amountOfDeposit * (percent / 100);
            amountOfDeposit = amountOfDeposit + monthlyIncrease;
            monthOfExcessOfIncrease = i;
        }
        return monthOfExcessOfIncrease;
    }

    private static void dataInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of deposit");
        amountOfDeposit = input.nextDouble();
        System.out.println("Enter the percent of the monthly increase in the deposit");
        percent = input.nextDouble();
        System.out.println("Enter the value of final monthly increase");
        finalMonthlyIncrease = input.nextDouble();
        System.out.println("Enter the final amount of the deposit");
        totalDepositAmount = input.nextDouble();
//        System.out.println(amountOfDeposit + "am" + percent + "per" + monthlyIncrease + "month" + totalDepositAmount + "tot");
    }


}
