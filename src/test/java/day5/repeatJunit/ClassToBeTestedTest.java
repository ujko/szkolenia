package day5.repeatJunit;

import day4.repeat.interfaces.InterfaceA;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassToBeTestedTest extends ClassToBeTested {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addNumbers_Test1() {
        int a = 171;
        int b = 3560;
        int c = 3731;
        assertTrue(c == addNumbers(a, b));
    }

    @Test
    public void addNumbers_Test2() {
        int a = 0;
        int b = 0;
        int c = 0;
        assertTrue("zero to nie zero",c == addNumbers(a, b));
    }

    @Test
    @Ignore
    public void addNumbers_Test3() {
        int a = 5;
        int b = -1;
        int c = 4;
        assertTrue(c == addNumbers(a, b));
    }

    @Test(expected = StackOverflowError.class)
    public void addNumbers_Test4() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = a + b;
        assertTrue(c == addNumbers(a, b));
    }

    @Test
    public void addNumbers_Test5() {
        int a = -5;
        int b = 5;
        int c = 0;
        assertTrue(c == addNumbers(a, b));
    }

    @Test
    @Ignore
    public void addNumbers_Test6() {
        int a = -5;
        int b = -5;
        int c = -10;
        assertTrue(c == addNumbers(a, b));
    }
    @Test
    public void addNumbers_Test7() {
        int a = 2;
        int b = 3;
        int c = 7;
        assertFalse(c == addNumbers(a, b));
    }

    @Test
    public void factorial_Test1() {
        int a = 4;
        int b = 24;
        assertEquals(factorial(a), b);
    }
    @Test (expected = IllegalArgumentException.class)
    public void factorial_Test2() {
        int a = -1;
        int b = 24;
        assertEquals(factorial(a), b);
    }

}