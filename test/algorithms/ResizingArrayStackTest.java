package algorithms;

import algorithms.lists.ResizingArrayStack;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 22/09/2016
 * Author: qinjiangbo@github.io
 */
public class ResizingArrayStackTest {

    private ResizingArrayStack<String> arrayStack;

    @Before
    public void initStack() {
        arrayStack = new ResizingArrayStack<String>();
    }

    @Test
    public void testPush() {
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("pear");
        System.out.println(arrayStack.size());
    }

    @Test
    public void testPop() {
        testPush();
        System.out.println(arrayStack.pop());
    }

}
