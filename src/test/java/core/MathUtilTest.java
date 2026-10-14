package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testFactorialGivenValidN5ReturnWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenInvalidNegative1ThrowException(){
        int n = -9;
        IllegalArgumentException error;
        error = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(n));
        assertEquals("Must: 0 < n < 20", error.getMessage());
    }

    @Test
    void testFactorialGiven0Returns1Well(){
        int n = 0;
        long expected = 1;
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}