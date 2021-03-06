package algorithms.sortings;

import java.util.Arrays;

/**
 * Date: 02/10/2016
 * Author: qinjiangbo@github.io
 */
public class InsertSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new InsertSorting().sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(j, j - 1, a);
                }
            }
        }
    }

}
