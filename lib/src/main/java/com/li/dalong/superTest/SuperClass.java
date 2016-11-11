package com.li.dalong.superTest;

/**
 * Created by Administrator on 2016/11/11.
 */
public class SuperClass {
    public static int value = 123;
    public static final String S = "hello world";
    static {
        System.out.print("Super!!!!");
    }
}
