package com.luo.wiley.springbootdemo.util;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root  = new ListNode();
        ListNode cursor = root;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int l1val = l1 != null? l1.val : 0;
            int l2val = l2 != null? l2.val : 0;
            int sumVal = l1val + l2val + carry;
            carry = sumVal/10;

            ListNode node = new ListNode(sumVal % 10);
            cursor.next = node;
            cursor = node;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return root.next;
    }

    public static ListNode toListNode(List<Integer> list, ListNode listNode) {
        if (list.isEmpty()) {
            return listNode;
        }
        ListNode child = new ListNode();
        child.val = list.get(0);
        list.remove(0);
        listNode.next = toListNode(list, child);
        return listNode;
    }

    public static void main(String[] args) {
//        ListNode listNode = new ListNode();
//        toListNode(Lists.newArrayList(1, 2, 3), listNode);
//        System.out.println(listNode.next);

        ArrayList<Integer> list1 = Lists.newArrayList(2, 4, 3);

        ArrayList<Integer> list2 = Lists.newArrayList(5, 6, 4);


        ListNode node = addTwoNumbers(toListNode(list1, new ListNode()).next, toListNode(list2, new ListNode()).next);
        System.out.println(node);
    }



}
