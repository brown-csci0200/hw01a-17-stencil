package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Homework1ATest {

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }

    /**
     * Here's an example test that checks for an exception
     * You can use this to make sure certain exceptions are raised
     * when an error occurs
     * Here's the format:
     * @Test(expected = <exception-type>.class)
     * public void <test-name>() {
     *      code that results in exception
     * }
     *
     * Here's an example:
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        // example syntax for testing exceptions
        // when writing your own tests try testing constructors or code that would throw an error
        throw new IllegalArgumentException("Incorrect inputs");
    }

    /**
     * It is helpful to put your tests in different methods! When the tester fails,
     *  it will let you know what method had the failing test.
     */
    @Test
    public void testExampleFailure() {
        /* Do not include this test in your final submission. We only include it to
           show you what a failed test looks like. Feel free to delete it! */
        Assert.assertEquals(2000000, 1 + 1);
    }
}
