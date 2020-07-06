//package com.luo.wiley.springbootdemo.service;
//
///**
// * Created by lsgem on 2019/10/17.
// */
//public class TestService {
//
//    /**
//     * 合并两个有序链表
//     */
//    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//
//        if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
//
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(5);
//        l1.next.next = new ListNode(9);
//        ListNode l2 = new ListNode(3);
//        l2.next = new ListNode(4);
//        l2.next.next = new ListNode(6);
//        System.out.print(mergeTwoLists(l1, l2).toString());
//    }
//
//}
//
///**
// * 链表数据结构
// */
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//
//    @Override
//    public String toString() {
//        return "ListNode{" +
//                "val=" + val +
//                ", next=" + next +
//                '}';
//    }
//}
//
///**
// 栈数据结构
// **/
//class ArrayStack {
//
//    private String[] items;
//
//    private int n;
//
//    private int count;
//
//    public ArrayStack(int n){
//        this.items = new String[n];
//        this.n = n;
//        this.count = 0;
//    }
//
//    public boolean push(String item) {
//        if (count == n) {
//            return false;
//        }
//        items[count] = item;
//        ++count;
//        return true;
//    }
//
//    public String pop() {
//        if (count == 0) {
//            return null;
//        }
//        String value = items[count-1];
//        --count;
//        return value;
//    }
//
//}