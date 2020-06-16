package com.company.book;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr1, 3));
        System.out.println(binarySearch(arr1, -3));
    }

    public static int binarySearch(int[] array, int num) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int x = array[mid];
            if (x == num) {
                return mid;
            }
            if (x < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
