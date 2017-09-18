package com.muntian.ClassWork.CW17_07_17.CW18_09_17;

public class Main {

    public static void main(String[] args) {

        HourlyWorker jamshut = new HourlyWorker("Jamshut", 2);
        HourlyWorker ravshan = new HourlyWorker("Ravshan", 10);
        HourlyWorker sigizmund = new HourlyWorker("Radgesh", 5);
        HourlyWorker albert = new HourlyWorker("Albert", 7);

        MonthWorker tim = new MonthWorker("Timothy", 300);
        MonthWorker bob = new MonthWorker("Bobby", 600);
        MonthWorker alex = new MonthWorker("Alex", 1300);
        MonthWorker artur = new MonthWorker("Artur", 400);

        Worker[] workers = new Worker[]{jamshut, ravshan, sigizmund, albert, tim, bob, alex, artur};

        printListOfWorkers(sortWorkersBySalary(workers));
    }

    private static boolean compareWorkersBySalary(Worker worker1, Worker worker2) {
        return worker1.countSalary() < worker2.countSalary();
    }

    public static Worker[] sortWorkersBySalary(Worker[] workers) {
        Worker[] sortList = workers.clone();
        for (int i = 0; i < workers.length; i++) {
            for (int j = 1; j < (workers.length - i); j++) {
                if (compareWorkersBySalary(workers[j - 1], workers[j])) {
                    Worker temp = sortList[j - 1];
                    sortList[j - 1] = sortList[j];
                    sortList[j] = temp;
                }
            }
        }
        return sortList;
    }

    private static void printListOfWorkers(Worker[] workers) {
        System.out.println("ID\t\tName\t\t\t\tSalary");
        System.out.println("-------------------------------------");
        for (int i = 0; i < workers.length; i++) {
            System.out.printf("%d\t\t%s\t\t\t\t%f%n",
                    workers[i].getiD(),
                    workers[i].getName(),
                    workers[i].countSalary());
        }
    }

}
