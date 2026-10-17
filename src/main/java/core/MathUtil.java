package core;

public class MathUtil {
    public static long getFactorial(int n)  {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Must: 0 < n < 20");
        long result = -765;
        if (n == 0){
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }

    }
}
