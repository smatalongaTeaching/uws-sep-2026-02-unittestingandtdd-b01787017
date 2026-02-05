package Excercise4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_IsNotEmpty (){
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test (expected = Stack.Underflow.class)
    public void willThrowUnderFlow_WhenEmptyStackIsPopped (){
        stack.pop();
    }

    @Test
    public void afterOnePushAndPop_IsEmpty (){
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushesAndOnePop_IsNotEmpty (){
        stack.push(0);
        stack.push(0);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_WillPopX () {
        stack.push(99);
        assertEquals(99, stack.pop());
        stack.push(88);
        assertEquals(88, stack.pop());
    }
    
    @Test
    public void afterPushingXAndY_WillPopYThenX () {
        stack.push(99);
        stack.push(88);
        assertEquals(88, stack.pop());
        assertEquals(99, stack.pop());
    }
}
