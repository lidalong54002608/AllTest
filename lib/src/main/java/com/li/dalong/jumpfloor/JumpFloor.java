package com.li.dalong.jumpfloor;

/**
 * Created by Administrator on 2016/11/13.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {

    /**
     * 递归方法，效率低，比较容易想到。
     * @param floor
     * @return
     */
    public int solution1(int floor) {
        if(floor <= 0) {
            return  0;
        } else if (floor == 1) {
            return 1;
        } else if (floor == 2) {
            return 2;
        } else {
            return solution1(floor - 1) + solution1(floor - 2);
        }
    }

    public int solution2(int floor) {
        if(floor <= 0) {
            return  0;
        } else if (floor == 1) {
            return 1;
        } else if (floor == 2) {
            return 2;
        } else {
            // 第一阶和第二阶考虑过了，初始当前台阶为第三阶，向后迭代
            // 思路：当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
            int jumpSum = 0;// 当前台阶的跳法总数
            int jumpSumBackStep1 = 2;// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)
            int jumpSumBackStep2 = 1;// 当前台阶后退二阶的台阶的跳法总数(初始值当前台阶是第3阶)
            for(int i = 3; i <= floor; i++) {
                jumpSum= jumpSumBackStep1 + jumpSumBackStep2;
                jumpSumBackStep2 = jumpSumBackStep1;// 后退一阶在下一次迭代变为后退两阶
                jumpSumBackStep1 = jumpSum;// 当前台阶在下一次迭代变为后退一阶
            }
            return jumpSum;
        }
    }

    public static void main(String s[]) {
        int floor = 20;
        JumpFloor jf = new JumpFloor();
        int result = jf.solution2(floor);
        System.out.print(result);
    }
}
