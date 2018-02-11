package com.muntian.ClassWork.CW17_07_17.multithreading_exemple_from_internet;

public class SimpleThreadManager
{
    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Thread first = new SimpleThread();
            first.start();
        }
    }
}

class SimpleThread extends Thread
{
    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println("Simple Thread - pause="+pause);
        } catch(InterruptedException i_ex) {

        }
    }
}
