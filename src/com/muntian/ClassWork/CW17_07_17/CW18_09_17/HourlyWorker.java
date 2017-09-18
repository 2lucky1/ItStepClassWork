package com.muntian.ClassWork.CW17_07_17.CW18_09_17;

public class HourlyWorker extends Worker {

    private static final double DAYS_COEFFICIENT = 20.8;
    private static final int WORKING_HOURS = 8;

    public HourlyWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double countSalary() {
        return DAYS_COEFFICIENT * WORKING_HOURS * getRate();
    }
}
