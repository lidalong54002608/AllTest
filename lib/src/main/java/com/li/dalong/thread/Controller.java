package com.li.dalong.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2016/11/16.
 */
public class Controller {

    public int mCount;
    public boolean mShouldRun;
    ProduceQueen<String> queue;

    public Controller() {
        queue = new ProduceQueen<String>();
    }

    public void produce(String tag) {
        synchronized (queue) {
            mCount++;
            queue.push("" + mCount);
        }
        //System.out.println("+Factory " + tag + " produce, total count = " +mCount);
    }

    public void consume(String tag) {
        //mCount--;
        synchronized (queue) {
            queue.pop();
        }
        //System.out.println("-Customer " + tag + " consume, total count = " +mCount);
    }

    public static Controller mController;
    public static Controller getInstance() {
        if (mController == null) {
            mController = new Controller();
        }
        return mController;
    }

    Thread InThread1 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(3321);
                    produce("in1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread InThread2 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1896);
                    produce("in2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread InThread3 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1111);
                    consume("in2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private void runInThread() {
        InThread1.start();
        InThread2.start();
        InThread3.start();
    }

    public static void main(String s[]) {
//        Thread thread2 = new Thread(new FactoryThreadTwo());
//        thread2.start();
//        Thread thread = new FactoryThreadOne();
//        thread.start();
        Controller c = new Controller();
        c.runInThread();

    }
}
