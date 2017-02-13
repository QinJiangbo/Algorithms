package algorithms.general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @date: 13/02/2017 9:35 PM
 * @author: qinjiangbo@github.io
 */
public class AlgsData {

    private static final String DATA =
            "/Users/Richard/Documents/WHU/高级架构师之路/Data Structure and Algorithms/Resources/algs4-data/";

    /**
     * read the data into stream
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public static InputStream in(String fileName) throws FileNotFoundException {
        String filePath = DATA + fileName;
        return new FileInputStream(new File(filePath));
    }
}
