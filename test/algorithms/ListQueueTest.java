package algorithms;

import algorithms.lists.ListQueue;
import org.junit.Test;

import java.util.Iterator;

/**
 * Date: 25/09/2016
 * Author: qinjiangbo@github.io
 */
public class ListQueueTest {

    @Test
    public void testListQueue() {
        ListQueue<String> queue = new ListQueue<String>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("go");
        System.out.println(queue.size());
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
