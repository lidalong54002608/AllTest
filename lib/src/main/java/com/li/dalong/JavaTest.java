package com.li.dalong;

public class JavaTest {

    private static int NMU = 385;

    public static void main(String[] args) {
        int n = NMU;
        int k = 2;
        while (n > k) {
            if (n % k == 0) {
                n = n / k;
                System.out.println(k);
            } else {
                k++;
            }
        }
        System.out.println(k);
    }
}
