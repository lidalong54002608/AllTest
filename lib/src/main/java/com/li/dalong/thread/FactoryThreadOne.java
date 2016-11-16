package com.li.dalong.thread;

/**
 * Created by Administrator on 2016/11/16.
 */
public class FactoryThreadOne extends Thread {

    @Override
    public void run() {
        Controller controller = Controller.getInstance();
        while (true) {
            controller.produce("1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}
