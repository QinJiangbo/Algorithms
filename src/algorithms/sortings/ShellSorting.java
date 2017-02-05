package algorithms.sortings;

import java.util.Arrays;

/**
 * @date: 18/01/2017 10:51 PM
 * @author: qinjiangbo@github.io
 */
public class ShellSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new ShellSorting().sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (a[j] < a[j-h]) {
                        swap(j, j-h, a);
                    }
                }
            }
            h = h/3;
        }
    }
}
