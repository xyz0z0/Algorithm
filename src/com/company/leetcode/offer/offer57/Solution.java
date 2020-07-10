package com.company.leetcode.offer.offer57;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        int[][] ints = findContinuousSequence(3);
        System.out.println(Arrays.deepToString(ints));
    }

    public static int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < target; i++) {
            int sum = i;
            List<Integer> integers = new ArrayList<>();
            integers.add(i);
            for (int j = i + 1; j < target; j++) {
                sum += j;
                integers.add(j);
                if (sum == target) {
                    list.add(integers);
                    break;
                }
                if (sum > target) {
                    break;
                }
            }
        }
        int size = list.size();
        int[][] arr = new int[size][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> a = list.get(i);
            int[] ints = new int[a.size()];
            for (int j = 0; j < a.size(); j++) {
                ints[j] = a.get(j);
            }
            arr[i] = ints;
        }
        return arr;
    }
}