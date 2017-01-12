package execises;

/**
 * Created by Richard on 7/5/16.
 */
public class Question1116 {

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}
