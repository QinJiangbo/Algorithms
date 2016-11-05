package algorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Date: 05/11/2016
 * Author: qinjiangbo@github.io
 */
public class StringBufferTest {

    public static void main(String[] args) {
        String input = "Hello World! I am from China!";
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group().toUpperCase());
        }
        System.out.println("before[tail]: " + stringBuffer);
        matcher.appendTail(stringBuffer);
        System.out.println("after[tail]: " + stringBuffer);
    }

}
