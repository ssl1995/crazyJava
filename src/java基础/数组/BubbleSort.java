package java基础.数组;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        // 外层只用比较len-1次,比如2个数排序只用比较1次出结果
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap = false;
            // 内层比较j和j+1的元素
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 交换j，j+1的数
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            // 没有发生交换就表示不用再排序了
            if (!isSwap) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
