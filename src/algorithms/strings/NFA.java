package algorithms.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date: 18/02/2017 11:12 PM
 * @author: qinjiangbo@github.io
 */
public class NFA {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("AA*B");
        Matcher matcher = pattern.matcher("AAAAAB");
        System.out.println(matcher.find());
    }
}
