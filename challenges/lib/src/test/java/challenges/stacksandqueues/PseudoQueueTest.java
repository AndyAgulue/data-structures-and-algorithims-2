package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
    @Test
    public void testEnqueue(){

    PseudoQueue test = new PseudoQueue();
    test.enQueue(7);
    test.enQueue(6);
    test.enQueue(5);
    test.enQueue(4);
    Object expected = 4;
    Object actual = test.stackOne.top.value;
    assertEquals(expected, actual);

    }
    @Test
    public void testDequeue(){
        PseudoQueue test = new PseudoQueue();
        test.enQueue(7);
        test.enQueue(6);
        test.enQueue(5);
        test.enQueue(4);
        Object expected1 = 7;
        Object actual1 = test.stackTwo;
        assertEquals(expected1, actual1);
    }






}
