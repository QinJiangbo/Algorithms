package lintcode;

/**
 * @date: 24/02/2017 1:08 AM
 * @author: qinjiangbo@github.io
 * @description:
 *      给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 */
public class APlusB {

    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public static int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        if (a == 0) return b;
        if (b == 0) return a;
        return aplusb(a^b, (a&b)<<1);
    }

    public static void main(String[] args) {
        System.out.println(aplusb(1, 5));
    }
}
