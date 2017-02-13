package algorithms;

import algorithms.general.ThreeSum;
import org.junit.Test;

/**
 * Date: 29/09/2016
 * Author: qinjiangbo@github.io
 */
public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        int[] a = new int[]{11, -4, -7, -8, 13, -5, -4, 9, 12, 13, -21};
        System.out.println(ThreeSum.count(a));
    }
}
