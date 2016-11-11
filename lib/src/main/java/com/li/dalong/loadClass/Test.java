package com.li.dalong.loadClass;

/**
 * Created by Administrator on 2016/11/11.
 */
public class Test {

    public static void main(String[] arg) {
        //System.out.print(SubClass.value); // only init SuperClass where defined 'value'
        //SuperClass[] superArray = new SuperClass[2]; // nothing print!!
        System.out.print(SuperClass.S); // just print 'hello world'
    }
}
