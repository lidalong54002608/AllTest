package com.li.dalong.array;

/**
 * Created by Administrator on 2016/11/13.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInArray {
    public boolean Find(int [][] array,int target) {
        int y = array.length - 1;
        int x = 0;

        while (y >= 0 && x < array[0].length) {
            if (target > array[y][x]) {
                x++;
            } else if (target < array[y][x]) {
                y--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String a[]) {
        int[][] array = new int[][] {
                {1, 4, 5, 6, 9},
                {2, 7, 8, 11, 14},
                {3, 10, 12, 13, 15},
                {5, 12, 16, 17, 18},
                {7, 14, 21, 27, 32}};
        int i = 19;
        FindInArray findInArray = new FindInArray();
        boolean find = findInArray.Find(array, i);
        System.out.print(find);
    }
}
