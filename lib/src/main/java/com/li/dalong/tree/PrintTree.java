package com.li.dalong.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * Created by Administrator on 2016/11/13.
 */
public class PrintTree {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode createTree() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        return node;
    }

    public void printTree (TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(0,root);
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!list.isEmpty()) {
            TreeNode node = list.get(0);
            result.add(node.val);
            list.remove(0);
            System.out.print(node.val);
            if(node.left != null) {
                list.add(node.left);
            }
            if(node.right != null) {
                list.add(node.right);
            }
        }
    }

    public static void main(String s[]) {
        PrintTree p = new PrintTree();
        p.printTree(p.createTree());
    }
}
