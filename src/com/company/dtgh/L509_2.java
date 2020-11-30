package com.company.dtgh;

public class L509_2 {

    public static void main(String[] args) {
        // 18 - 2584
        System.out.println(fib(18));
    }

    public static int fib(int N) {
        if (N < 1) {
            return 0;
        }
        if (N == 1 || N == 2) {
            return 1;
        }
        int prev = 1;
        int curr = 1;
        for (int i = 3; i <= N; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

}
