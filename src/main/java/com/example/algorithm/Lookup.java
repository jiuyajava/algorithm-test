package com.example.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 查找
 */
public class Lookup {

    /**
     * 二分查找,非递归
     */
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {

                left = mid + 1; // 注意
            } else if (array[mid] > target) {
                right = mid - 1; // 注意
            }
        }
        return -1;
    }

    /**
     * 冒泡排序
     */
    static void BubbleSort(int array[], int n) {
        int i, j, k;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
    }

    /**
     * 选择排序
     */
    static void BubbleSort2(int arr3[]) {
        //int arr3[]= {23,12,48,56,45};
        for(int i=0;i<arr3.length;i++) {
            int tem=i;
            //将数组中从i开始的最小的元素所在位置的索引赋值给tem
            for(int j=i;j<arr3.length;j++) {
                if(arr3[j]<arr3[tem]) {
                    tem=j;
                }
            }
            //上面获取了数组中从i开始的最小值的位置索引为tem，利用该索引将第i位上的元素与其进行交换
            int temp1=arr3[i];
            arr3[i]=arr3[tem];
            arr3[tem]=temp1;
        }

    }



    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 11, 8, 9, 10,7,-1,-2};
        Arrays.sort(array);
        int target = -2;
        int i = binarySearch(array, target);
        System.out.println(array[i]);


    }
}
