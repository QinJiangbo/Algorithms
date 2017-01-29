package algorithms.sortings;

/**
 * @date: 21/01/2017 11:15 PM
 * @author: qinjiangbo@github.io
 */
public class QuickSorting extends BaseSorting {

    @Override
    public void sort(int[] a) {

    }

    /**
     * partition the array elements
     *
     * @param a array
     * @param hi
     * @param lo
     */
    private int partition(int[] a, int lo, int hi) {
        int k = a[lo]; // flag
        int i = lo + 1, j = hi;
        while (i <= j) {
            while (a[i] <= a[k]) {
                i++;
            }
            while (a[j] >= a[k]) {
                j--;
            }
            swap(i, j, a);
        }
        swap(lo, j, a);
        return j;
    }
}
