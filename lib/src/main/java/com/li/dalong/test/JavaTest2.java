package com.li.dalong.test;

/**
 * Created by Administrator on 2016/11/8.
 */
public class JavaTest2 {
    public static void main(String[] args) {
        int left = 99;
        int right = 6;
        int a = left;
        int b = right;
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.print("最大公约数  == " + a);
        System.out.print("最小公倍数  == " + left * right / a);
    }
}
