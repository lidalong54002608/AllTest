package com.li.dalong.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Test {

    void change(int i, String s, String[] array) {
        i = 2;
        s = "LLL";
        array[0] = "66666";
        HashMap m;
    }

    public static void main(String arg[]){
//        ArrayList s = new ArrayList() {
//            @Override
//            public boolean equals(Object o) {
//                return super.equals(o);
//            }
//        };
//        Object o = new Object(){
//            @Override
//            public boolean equals(Object obj) {
//                return super.equals(obj);
//            }
//        };

        Test test = new Test();
        int int1= 3;
        String str = "Hello";
        str.toUpperCase();
        System.out.println(str);
        String[] arr = new String[] {"sss1", "sss2"};
        test.change(int1, str, arr);
        System.out.print(int1 + "," + str + "," +arr[0]);
    }
}
