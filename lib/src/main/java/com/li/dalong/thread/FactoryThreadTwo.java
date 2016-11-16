package com.li.dalong.thread;

/**
 * Created by Administrator on 2016/11/16.
 */
public class FactoryThreadTwo implements Runnable {
    @Override
    public void run() {
        Controller controller = Controller.getInstance();
        while (true) {
            controller.produce("2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
