package com.company.leetcode.offer.offer06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        System.out.println(Arrays.toString(reversePrint(node1)));
    }

    public static int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        do {
            list.add(head.val);
            head = head.next;
        } while (head != null);
        int size = list.size();
        int[] array = new int[size];
        for (int j = size - 1, i = 0; j >= 0; j--, i++) {
            array[i] = list.get(j);
        }
        return array;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

