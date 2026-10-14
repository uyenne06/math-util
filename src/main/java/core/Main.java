package core;

public class Main {
    static void main() {
    }

    public static void testFactorialGivenAValid5RunWell() {
        int n = 5;
        long expectedValue = 120;
        long actualValue =  MathUtil.getFactorial(n);
        System.out.println(n + "! = ");
        System.out.println("Expected result: " + expectedValue);
        System.out.println("Actual result: " + actualValue);
        System.out.println("Test result: " + ((expectedValue == actualValue) ? "PASSED" : "FAILED"));
    }
}