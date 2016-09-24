package algorithms;

import org.junit.Test;

import java.util.Iterator;

/**
 * Date: 25/09/2016
 * Author: qinjiangbo@github.io
 */
public class ListStackTest {

    @Test
    public void testListStack() {
        ListStack<String> strings = new ListStack<String>();
        strings.push("hello");
        strings.push("world");
        strings.push("go");
        System.out.println(strings.size());
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
