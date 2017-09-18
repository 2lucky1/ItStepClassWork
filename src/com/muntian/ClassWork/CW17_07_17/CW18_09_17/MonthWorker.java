package com.muntian.ClassWork.CW17_07_17.CW18_09_17;

public class MonthWorker extends Worker {

    public MonthWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double countSalary() {
        return getRate();
    }
}
