package sort;

import java.util.Arrays;

/**
 * Created by Faker on 2018\4\16 0016.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class BubbleSort {

    public static void main(String args[]) {
        int[] a = new int[]{9, 6, 122, 3, 55, 7, 2, 7, 5, 6};
        System.out.print(Arrays.toString(sort(a)));
    }


    /**
     *
     * @param a
     * @return
     */
    public static int[] sort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    exchange(j, j + 1, a);
                }
            }
        }
        return a;

    }

    private static void exchange(int j, int i, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
