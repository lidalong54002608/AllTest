package com.li.dalong.thread;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/11/16.
 */
public class ProduceQueen<T> {

    private LinkedList<T> list;

    public ProduceQueen() {
        list = new LinkedList<T>();
    }

    public void push(T item) {
        list.add(item);
        System.out.println("+ queen push " + item +" size = " + list.size());
    }

    public T pop() {
        if(list.size() > 0) {
            T item = list.get(0);
            list.remove(0);
            System.out.println("- queen pop " + item + " size = " + list.size());
            return item;
        } else {
            System.out.println("empty queen");
            return null;
        }
    }
}
