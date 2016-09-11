package chapter11;

/**
 * Created by Richard on 7/5/16.
 */
public class Question1114 {

    public static void main(String[] args) {
        System.out.println(lg(32));
    }

    public static int lg(int N) {
        int count = 0;
        for (int i=N; i>1; i=i/2) {
            count++;
        }
        return count;
    }

}
