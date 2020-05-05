package com.example.algorithm;

public class QuickSort {

    public static void qsort(int arr[], int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int pivot = arr[left];
        //数组中比pivot小的放在左边，比key大的放在右边
        int i = left;
        int j = right;
        while (i < j) {
            // j 比pivot小的向左移，
            while (i < j && arr[j] > pivot) {
                j--;
            }
            //i pivot大的比向右移
            while (i < j && arr[i] < pivot) {
                i++;
            }
            //i和j指向的元素交换
            if (arr[i] == arr[j] && i < j) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        qsort(arr, left, i - 1);
        qsort(arr, j + 1, right);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{18,45,78,64,52,11,64,55,99,11,18};
        int len = arr.length - 1;
        qsort(arr, 0, len);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}
