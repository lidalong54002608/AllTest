package com.li.dalong.test;

/**
 * Created by Administrator on 2016/11/12.
 *
 * in "hello my friend"
 * out "friend my hello"
 *
 */
public class StringTest {

    public static void main(String args[]) {
        String s = "hello  my friend";
        StringBuffer sb = new StringBuffer(s);
        char[] chars = new char[sb.length()];
        sb.getChars(0, sb.length(), chars, 0);
        StringBuffer buffer = new StringBuffer();

        for(int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            if(c == ' ') {
                if(buffer.length() > 0) {
                    System.out.print(buffer.reverse());
                    buffer.delete(0, buffer.length());
                }
                System.out.print(c);
            } else {
                buffer.append(c);
                if(i == 0) {
                    System.out.print(buffer.reverse());
                }
            }

        }
    }
}
