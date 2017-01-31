package algorithms.sortings;

import java.util.Arrays;

/**
 * @date: 21/01/2017 11:15 PM
 * @author: qinjiangbo@github.io
 */
public class QuickSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 19, 4, 13, 18};
        new QuickSorting().sort(a);
        System.out.println(Arrays.asList(a));
    }

    public void sort(int[] a, int lo, int hi) {
        int k = partition(a, lo, hi);
        sort(a, lo, k - 1);
        sort(a, k + 1, hi);
    }

    /**
     * partition the array elements
     *
     * @param a array
     * @param hi
     * @param lo
     */
    private int partition(int[] a, int lo, int hi) {
        int v = a[lo]; // guard
        int i = lo, j = hi;
        while (i < j) {
            while (a[i] <= v) { i++; }
            while (a[j] >= v) { j--; }
            if (i >= j) { break; }
            swap(i, j, a);
        }
        swap(lo, j, a);
        return j;
    }

    @Override
    public void sort(int[] a) {
        int lo = 0, hi = a.length - 1;
        sort(a, lo, hi);
    }
}
