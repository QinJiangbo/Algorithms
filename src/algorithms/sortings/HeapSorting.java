package algorithms.sortings;

import java.util.Arrays;

/**
 * @date: 21/01/2017 11:16 PM
 * @author: qinjiangbo@github.io
 */
public class HeapSorting extends BaseSorting {

    public static void main(String[] args) {
        int[] a = {11, 4, 6, 3, 9, 4, 13, 18};
        new HeapSorting().sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void sort(int[] a) {
        int N = a.length - 1;
        for (int k = N/2; k >= 0; k--) {
            sink(a, k, N);
        }
        while (N > 0) {
            swap(0, N--, a);
            sink(a, 0, N);
        }
    }

    /**
     * sink the element to the bottom
     * @param k
     * @param N
     */
    private void sink(int[] a, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && a[j] < a[j+1]) { j++; }
            if (a[k] >= a[j]) { break; }
            swap(k, j, a);
            k = j;
        }
    }

}
