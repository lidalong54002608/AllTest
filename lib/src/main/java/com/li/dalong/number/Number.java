package com.li.dalong.number;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Number {

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
            System.out.println(n);
        }
        System.out.println(count);
        return count;
    }

    public static void main(String arg[]) {
        Number n = new Number();
        n.NumberOf1(21);
    }
}
