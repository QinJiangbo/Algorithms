package algorithms.general;

import edu.princeton.cs.algs4.In;

import java.io.*;

/**
 * @date: 13/02/2017 9:35 PM
 * @author: qinjiangbo@github.io
 */
public class AlgsData {

    private static final String DATA =
            "/Users/Richard/Documents/WHU/高级架构师之路/Data Structure and Algorithms/Resources/algs4-data/";

    /**
     * read data into stream
     * @param fileName
     * @return
     */
    public static In in(String fileName) {
        String filePath = DATA + fileName;
        return new In(new File(filePath));
    }

}
