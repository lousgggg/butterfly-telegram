package com.luo.wiley.springbootdemo.util;

public class ListNode {
    /**
     * 链表数据结构
     */
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
