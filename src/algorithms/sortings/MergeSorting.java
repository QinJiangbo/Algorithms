package algorithms.sortings;

import java.util.Arrays;

/**
 * Date: 03/10/2016
 * Author: qinjiangbo@github.io
 */
public class MergeSorting extends BaseSorting {

    private int[] aux;

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new MergeSorting().sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length-1);
    }

    /**
     * sorting method
     * @param a
     * @param lo
     * @param hi
     */
    private void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    /**
     * merge method for combining two arrays into one
     *
     * @param a  array
     * @param lo low index
     * @param hi high index
     */
    private void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++]; // left out
            else if (j > hi) a[k] = aux[i++]; // right out
            else if (aux[j] <= aux[i]) a[k] = aux[j++]; // choose less one
            else a[k] = aux[i++];
        }
    }
}
