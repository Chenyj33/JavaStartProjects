package arrayss;

import java.util.Arrays;

/**
 * @author CHEN YANJIN
 * @date 2022/8/8 20:04
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 99, 48};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("这是第" + i + "轮排序");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
