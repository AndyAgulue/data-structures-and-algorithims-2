package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;





    public class LinkedListTest {

        @Test
        public void insertTest() {
            LinkedList test1 = new LinkedList();
            test1.insert(1555);
            int expected = 1555;
            int actual = test1.head.value;
            assertEquals("insert 1555", expected, actual);
        }

        @Test
        public void emptyTest(){
            LinkedList test2 = new LinkedList();
            LinkedList base2 = new LinkedList();
            Node expected1 = null;
            Node actual1 = test2.head;
            assertEquals("expect a null value for head", expected1, actual1);
        }

        @Test
        public void includesTest(){
            LinkedList test3 = new LinkedList();
            test3.insert(144);
            test3.insert(233);
            test3.insert(377);
            test3.insert(610);
            test3.insert(987);
            boolean box = test3.includes(144);
            assertTrue("should return 144", box);

        }

        @Test
        public void excludesTest(){
            LinkedList test4 = new LinkedList();
            test4.insert(987);
            test4.insert(610);
            test4.insert(377);
            test4.insert(233);
            test4.insert(100);
            boolean box2 = test4.includes(144);
            assertFalse("should return 144", box2);
        }

        @Test
        public void stringTest(){
            LinkedList test5 = new LinkedList();
            test5.insert(5);
            test5.insert(3);
            test5.insert(2);
            String expected = "{ 2 } -> { 3 } -> { 5 } -> NULL";
            String actual = test5.toString();
            assertEquals(expected, actual);

        }

        @Test
        public void headTest() {
            LinkedList test = new LinkedList();
            test.insert(1);
            test.insert(2);
            test.insert(3);
            test.insert(5);
            int expected = 5;
            int actual = test.head.value;
            assertEquals("head is 5", expected, actual);

        }



        @Test
        public void multipleTest(){
            LinkedList test = new LinkedList();
            test.insert(7777);
            int expected = 7777;
            int actual = test.head.value;
            test.insert(7171);
            int expected2 = 7171;
            int actual2 = test.head.value;
            assertEquals("insert 7777", expected, actual);
            assertEquals("insert 7171", expected2, actual2);
        }

        @Test
        public void appendTest(){
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.append(7);
            String expected = "{ 3 } -> { 2 } -> { 1 } -> { 7 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }

        @Test
        public void appendTest2(){
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.append(5);
            list.append(8);
            String expected = "{ 3 } -> { 2 } -> { 1 } -> { 5 } -> { 8 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }
        @Test
        public void insertBeforeTest(){
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insertBefore(2, 8);
            String expected = "{ 3 } -> { 8 } -> { 2 } -> { 1 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }

        @Test
        public void insertBeforeTest2() {
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insertBefore(1, 9);
            String expected = "{ 3 } -> { 2 } -> { 9 } -> { 1 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }

        @Test
        public void insertAfterTest(){
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insertAfter(2, 5);
            String expected = "{ 3 } -> { 2 } -> { 5 } -> { 1 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }

        @Test
        public void insertAfterTest2(){
            LinkedList list = new LinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insertAfter(1, 8);
            String expected = "{ 3 } -> { 2 } -> { 1 } -> { 8 } -> NULL";
            String actual = list.toString();
            assertEquals(expected, actual);
        }

        @Test
        public void kthFromEndTest(){
            LinkedList list = new LinkedList();
            list.insert(10);
            list.insert(9);
            list.insert(8);
            list.insert(7);

            // test to see if the (k) is greater than the length of the linked list
            Object actual = list.kthFromEnd(5);
            Object expected = "Invalid value";
            assertEquals(" Tests that k is greater than the value", expected, actual);

            // test to see if the (k) is the same length of the linked list
            Object actual1 = list.kthFromEnd(4);
            Object expected1 = "Invalid value";
            assertEquals(" Tests that k and value are the same length", expected1, actual1);

        }

    }

