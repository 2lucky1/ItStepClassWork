package com.muntian.ClassWork.CW17_07_17.multithreading;

import javax.lang.model.type.UnionType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Hello! I'm thread number1");
//            try {
////                Thread.sleep(5353);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        });
        thread.start();

        System.out.println("Executor action");

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Execution #" + finalI);
                }
            });
        }
        service.shutdown();
        Thread.sleep(4000);
        System.out.println("thread is alive:" + thread.isAlive());

        System.out.println("Executor: " + service.isShutdown());
        final int[] count = {0};
        System.out.println("Try ScheduledExecutorService:");
        ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
        service1.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run #" + count[0]);
                count[0]++;
            }
        }, 5, TimeUnit.SECONDS);

        service1.shutdown();
    }

}


