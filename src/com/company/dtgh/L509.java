package com.company.dtgh;

public class L509 {

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    public static int fib(int N) {

        int[] arr = new int[N + 1];
        return helper(arr, N);
    }

    public static int helper(int[] arr, int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (arr[N] > 0) {
            return arr[N];
        }
        arr[N] = helper(arr, N - 1) + helper(arr, N - 2);
        return arr[N];
    }

}
