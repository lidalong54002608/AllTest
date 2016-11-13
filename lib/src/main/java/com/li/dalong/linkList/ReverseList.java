package com.li.dalong.linkList;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * Created by Administrator on 2016/11/13.
 */
public class ReverseList {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode create() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(3);
        root.next.next = new ListNode(4);
        root.next.next.next = new ListNode(5);
        return root;
    }

    public ListNode reverse (ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while(root != null) {
            next = root.next;
            root.next = pre;
            pre = root;
            root = next;
        }
        return pre;
    }

    public void print(ListNode root) {
        do {
            System.out.print(root.val);
            root = root.next;
        } while (root != null);
    }

    public static void main(String [] s) {
        ReverseList r = new ReverseList();
        ListNode root = r.create();
        //r.print(root);
        ListNode rev = r.reverse(root);
        r.print(rev);
    }
}
