package problems;

import java.util.Random;

/**
 * Created by Richard on 7/5/16.
 */
public class Question1110 {

    //psvm
    public static void main(String[] args) {
        boolean[][] bools = new boolean[10][10];
        for (int i = 0; i<bools.length; i++) {
            for (int j = 0; j<bools[i].length; j++) {
                System.out.print(trueOrFalse()==true ? "*" : " "+"\t");
            }
            System.out.println();
        }
    }

    /**
     * true or false
     * @return
     */
    public static boolean trueOrFalse() {
        Random random = new Random();
        int value = random.nextInt(10);
        return value > 5;
    }

}
