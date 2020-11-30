package com.company.dtgh

fun main() {
    print(fib(18))
}

fun fib(N: Int): Int {
    if (N == 0) {
        return 0
    }
    if (N == 1 || N == 2) {
        return 1
    }
    val array = IntArray(N + 1)
    array[1] = 1
    array[2] = 1
    for (i in 3..N) {
        array[i] = array[i - 1] + array[i - 2]
    }
    return array[N]
}