package FizzBuzz;

import org.junit.Test;
import static org.junit.Assert.*;
public class FizzBuzzTest {

    @Test public void test3Fizz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 3;
        String expected = "Fizz";
        assertEquals("Fizz test failed",expected, classUnderTest.toString(input));
    }
    @Test public void test5Buzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 5;
        String expected = "Buzz";
        assertEquals("Buzz test failed",expected, classUnderTest.toString(input));
    }
    @Test public void test7Bang() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 7;
        String expected = "Bang";
        assertEquals("Bang test failed",expected, classUnderTest.toString(input));
    }

    @Test public void test15FizzBuzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 3*5;
        String expected = "FizzBuzz";
        assertEquals("FizzBuzz test failed",expected, classUnderTest.toString(input));
    }
    @Test public void test21FizzBang() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 3*7;
        String expected = "FizzBang";
        assertEquals("FizzBang test failed",expected, classUnderTest.toString(input));
    }
    @Test public void test35BuzzBang() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 5*7;
        String expected = "BuzzBang";
        assertEquals("BuzzBang test failed",expected, classUnderTest.toString(input));
    }

    @Test public void test110FizzBuzzBang() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 3*5*7;
        String expected = "FizzBuzzBang";
        assertEquals("FizzBuzzBang test failed",expected, classUnderTest.toString(input));
    }
    
    @Test public void test1() {
        FizzBuzz classUnderTest = new FizzBuzz();
        int input = 1;
        String expected = "1";
        assertEquals("1 test failed",expected, classUnderTest.toString(input));
    }
}
