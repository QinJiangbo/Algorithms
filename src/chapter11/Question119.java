package chapter11;

/**
 * Created by Richard on 7/5/16.
 */
public class Question119 {

    public static void main(String[] args) {
        String s = "";
        int N = 1587659871;
        /**
         * keep dividing 2 and take the remainder
         */
        for(int i = N; i > 0; i = i / 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
        System.out.println("===============================");
        System.out.println(Integer.toBinaryString(N));
    }

}
