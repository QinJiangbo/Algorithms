package algorithms;

import algorithms.general.TwoSum;
import org.junit.Test;

/**
 * Date: 30/09/2016
 * Author: qinjiangbo@github.io
 */
public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] a = new int[]{-1, -7, 8, -9, 6, 7, 1, 10, 4, -55, 43, -5, -6, -7};
        System.out.println(TwoSum.count(a));
    }
}
