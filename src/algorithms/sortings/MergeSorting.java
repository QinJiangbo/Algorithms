package algorithms.sortings;

/**
 * Date: 03/10/2016
 * Author: qinjiangbo@github.io
 */
public class MergeSorting extends BaseSorting {

    private int[] aux;

    @Override
    public void sort(int[] a) {

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
