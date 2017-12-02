package put.io.testing.junit;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;

public class FailureOrErrorTest {

    @Test
    public void test1() {
        assertTrue(false); // Failure
    }

    @Test
    public void test2() {
        int i = 2 / 0; // Error
    }

    @Test
    public void test3() {
        try {
            assertTrue(false);
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }

}