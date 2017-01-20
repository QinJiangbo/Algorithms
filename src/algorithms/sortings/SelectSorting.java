package algorithms.sortings;

import java.util.Arrays;

/**
 * Date: 02/10/2016
 * Author: qinjiangbo@github.io
 */
public class SelectSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new SelectSorting().sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(i, j, a);
                }
            }
        }
    }
}
